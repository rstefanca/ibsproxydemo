package cz.codingmonkey.utiltitypayment.services;

import com.google.common.collect.ImmutableList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import cz.bsc.g6.integration.ups.jaxb.*;

import cz.codingmonkey.utiltitypayment.api.*;
import cz.codingmonkey.utiltitypayment.api.PaymentGroup;
import cz.codingmonkey.utiltitypayment.api.PaymentRegion;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Richard Stefanca
 */
public class FrequentPaymentClient extends WebServiceGatewaySupport {

	private final ObjectFactory objectFactory = new ObjectFactory();

	@HystrixCommand
	public List<FrequentPayment> getFrequentPaymentList(int customerID, String channel) {
		return Collections.emptyList();
	}

	@HystrixCommand
	public Collection<PaymentGroup> getPaymentGroups() {
		GetPaymentGroups request = new GetPaymentGroups();
		GetPaymentGroupsResponse response = (GetPaymentGroupsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		List<PaymentGroup> paymentGroups = response.getPaymentGroups().stream().map(pg -> new PaymentGroup(pg.getPaymentGroupId(), pg.getNameEn())).collect(toList());
		return ImmutableList.copyOf(paymentGroups);
	}

	@HystrixCommand
	public Collection<PaymentRegion> getPaymentRegions(Integer paymentGroupId) {
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
						paymentRegion.getTelephoneCode())).collect(toList());

		return ImmutableList.copyOf(regions);
	}
}
