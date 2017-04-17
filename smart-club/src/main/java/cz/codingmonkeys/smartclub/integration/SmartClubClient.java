package cz.codingmonkeys.smartclub.integration;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import cz.codingmonkeys.smartclub.api.SmartClubInfo;
import cz.codingmonkeys.smartclub.integration.jaxb.GetSmartClubInfoRequest;
import cz.codingmonkeys.smartclub.integration.jaxb.GetSmartClubInfoResponse;
import cz.codingmonkeys.smartclub.integration.jaxb.SmartClubFinancialProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;

/**
 * @author Richard Stefanca
 */
@Slf4j
@Component
public class SmartClubClient extends WebServiceGatewaySupport {

	@Value("${smartclub.service.uri}")
	private String upsServiceUrl;

	@Autowired
	private Jaxb2Marshaller marshaller;


	@HystrixCommand
	public SmartClubInfo getSmartClubInfo(long clientId) {
		GetSmartClubInfoRequest request = new GetSmartClubInfoRequest();
		request.setClientId(clientId);

		GetSmartClubInfoResponse response = (GetSmartClubInfoResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		SmartClubFinancialProfile smartClubFinancialProfile = response.getSmartClubFinancialProfile();

		return new SmartClubInfo(smartClubFinancialProfile.isIsMember(), smartClubFinancialProfile.getPoints());
	}

	@PostConstruct
	public void init() {
		this.setDefaultUri(upsServiceUrl);
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}
}
