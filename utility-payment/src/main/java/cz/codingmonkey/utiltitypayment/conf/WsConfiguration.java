package cz.codingmonkey.utiltitypayment.conf;

import cz.codingmonkey.utiltitypayment.services.FrequentPaymentClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author rstefanca
 */
@Configuration
public class WsConfiguration {

	@Value("${ups.service.url}")
	private String upsServiceUrl;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("cz.bsc.g6.integration.ups.jaxb");
		return marshaller;
	}

	@Bean
	public FrequentPaymentClient quoteClient(Jaxb2Marshaller marshaller) {
		FrequentPaymentClient client = new FrequentPaymentClient();
		client.setDefaultUri(upsServiceUrl);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
