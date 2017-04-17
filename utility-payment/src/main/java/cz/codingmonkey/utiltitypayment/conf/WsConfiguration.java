package cz.codingmonkey.utiltitypayment.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author rstefanca
 */
@Configuration
public class WsConfiguration {


	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("cz.bsc.g6.integration.ups.jaxb");
		return marshaller;
	}


}
