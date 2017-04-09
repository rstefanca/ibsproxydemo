package cz.codingmonkey.utiltitypayment.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import cz.codingmonkey.utiltitypayment.api.FrequentPayment;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Richard Stefanca
 */
@Service
public class FrequentPaymentService {

	@HystrixCommand
	public List<FrequentPayment> getFrequentPaymentList(int customerID, String channel) {
		return Collections.emptyList();
	}
}
