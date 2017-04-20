package cz.codingmonkeys.smartclub.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Richard Stefanca
 */
@Service
@Slf4j
public class UserInfoService {

	@Autowired
	private RestTemplate restTemplate;

	@Cacheable(value = "userInfo")
	@HystrixCommand(commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
	})
	public UserInfo getUserInfo(String sessionId) {
		log.info("Retrieving info userInfo for session {}", sessionId);
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Cookie", "JSESSIONID=" + sessionId);
		HttpEntity<Object> requestEntity = new HttpEntity<>(null, requestHeaders);
		ResponseEntity<UserInfo> exchange = restTemplate.exchange(
				"http://localhost:8081/tbcibs-play/delegate/rest/user/v1/info",
				HttpMethod.GET,
				requestEntity,
				UserInfo.class
		);

		UserInfo userInfo = exchange.getBody();
		userInfo.setExternalClientId("6029"); //TODO add to user info response api
		return userInfo;
	}
}
