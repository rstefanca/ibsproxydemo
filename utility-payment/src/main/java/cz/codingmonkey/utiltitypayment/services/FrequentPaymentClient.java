package cz.codingmonkey.utiltitypayment.services;

import com.google.common.collect.ImmutableList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import cz.bsc.g6.integration.ups.jaxb.*;
import cz.codingmonkey.utiltitypayment.api.FrequentPayment;
import cz.codingmonkey.utiltitypayment.api.PaymentGroup;
import cz.codingmonkey.utiltitypayment.api.PaymentRegion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Richard Stefanca
 */
@Slf4j
@Component
public class FrequentPaymentClient extends WebServiceGatewaySupport {

	private final ObjectFactory objectFactory = new ObjectFactory();

	@Value("${ups.service.url}")
	private String upsServiceUrl;

	@Autowired
	private Jaxb2Marshaller marshaller;

	@HystrixCommand
	public List<FrequentPayment> getFrequentPaymentList(int customerID, String channel) {
		return Collections.emptyList();
	}

	@HystrixCommand(commandKey = "getPaymentGroups")
	public Collection<PaymentGroup> getPaymentGroups() {
		log.info("GetPaymentGroups WS Invocation");
		GetPaymentGroups request = new GetPaymentGroups();
		GetPaymentGroupsResponse response = (GetPaymentGroupsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		List<PaymentGroup> paymentGroups = response.getPaymentGroups().stream()
				.map(pg -> new PaymentGroup(pg.getPaymentGroupId(), pg.getNameEn()))
				.collect(toList());
		return ImmutableList.copyOf(paymentGroups);
	}

	@HystrixCommand(commandKey = "getPaymentRegions")
	public Collection<PaymentRegion> getPaymentRegions(Integer paymentGroupId) {
		log.info("GetPaymentRegions WS Invocation");
		GetPaymentRegions request = new GetPaymentRegions();

		if (paymentGroupId != null) {
			request.getPaymentGroupIds().add(paymentGroupId);
		}
		request.setChannelId(7364); //system param IBS_CHANNEL_ID_IN_UPS

		GetPaymentRegionsResponse response = (GetPaymentRegionsResponse)getWebServiceTemplate().marshalSendAndReceive(objectFactory.createGetPaymentRegions(request));
		List<PaymentRegion> regions = response.getPaymentRegions().stream()
				.map(paymentRegion -> new PaymentRegion(
						paymentRegion.getPaymentRegionId(),
						paymentRegion.getNameEn(),
						paymentRegion.getTelephoneCode()))
				.collect(toList());

		return ImmutableList.copyOf(regions);
	}

	@PostConstruct
	public void init() {
		this.setDefaultUri(upsServiceUrl);
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}
}
