package cz.codingmonkey.proxy.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Richard Stefanca
 */

@Service
public class CatalogService {

	@Autowired
	private RestTemplate restTemplate;

	@Cacheable(value = "catalogs", unless = "#result.isError")
	public CatalogResponse getCatalogFromService(String catalogType) {

		/*HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("Cookie", "JSESSIONID=" + sessionId);
		HttpEntity<Object> requestEntity = new HttpEntity<>(null, requestHeaders);
		ResponseEntity<Object> exchange = this.restTemplate.exchange(
				"http://localhost:8081/tbcibs-play/delegate/rest/user/v1/info",
				HttpMethod.GET, requestEntity, Object.class);*/
		throw new UnsupportedOperationException("Makame na tom");

	}
}
