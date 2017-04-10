package cz.codingmonkey.utiltitypayment.api;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * @author rstefanca
 */
@Value
@AllArgsConstructor
public class PaymentGroup {

	private final int id;
	private final String name;
}
