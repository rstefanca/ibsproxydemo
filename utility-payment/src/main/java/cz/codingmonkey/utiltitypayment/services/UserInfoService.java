package cz.codingmonkey.utiltitypayment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author rstefanca
 */

@Service
public class UserInfoService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	//cacheable
	public UserInfo getUserInfo(String sessionId) {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Cookie", "JSESSIONID=" + sessionId);
		HttpEntity<Object> requestEntity = new HttpEntity<>(null, requestHeaders);
		ResponseEntity<UserInfo> exchange = restTemplate.exchange(
				"http://localhost:8081/tbcibs-play/delegate/rest/user/v1/info",
				HttpMethod.GET,
				requestEntity,
				UserInfo.class
		);



		return exchange.getBody();
	}
}