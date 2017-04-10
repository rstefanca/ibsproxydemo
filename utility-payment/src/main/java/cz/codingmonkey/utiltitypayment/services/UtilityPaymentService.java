package cz.codingmonkey.utiltitypayment.services;


import com.google.common.collect.ImmutableList;
import cz.codingmonkey.utiltitypayment.api.FrequentPayment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Richard Stefanca
 */
@Service
@Slf4j
public class UtilityPaymentService {

	@Autowired
	private PaymentOrderService paymentOrderService;

	@Autowired
	private FrequentPaymentClient frequentPaymentClient;

	public List<FrequentPayment> getFrequentPayments(String clientId) {
		List<Integer> paymentListOrder = paymentOrderService.getPaymentListOrder(123456);
		List<FrequentPayment> payments = frequentPaymentClient.getFrequentPaymentList(Integer.parseInt(clientId), "IBS");
		HashMap<Integer, FrequentPayment> map = new HashMap<>(payments.size());
		for (FrequentPayment payment : payments) {
			map.put(payment.id, payment);
		}

		List<FrequentPayment> result = new ArrayList<>(payments.size());
		paymentListOrder.forEach(id -> result.add(map.remove(id)));
		result.addAll(map.values());
		return ImmutableList.copyOf(result);
	}




}
