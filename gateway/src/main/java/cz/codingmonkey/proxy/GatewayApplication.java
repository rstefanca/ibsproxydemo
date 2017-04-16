package cz.codingmonkey.proxy;

import cz.codingmonkey.proxy.filters.post.SessionFilter;
import cz.codingmonkey.proxy.filters.pre.LogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author rstefanca
 */

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public LogFilter simpleFilter() {
		return new LogFilter();
	}

	@Bean
	public SessionFilter sessionFilter() {
		return new SessionFilter();
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}

	/*@Bean
	public SendResponseFilter sendResponseFilter() {
		return new SendResponseFilter();
	}*/

}
