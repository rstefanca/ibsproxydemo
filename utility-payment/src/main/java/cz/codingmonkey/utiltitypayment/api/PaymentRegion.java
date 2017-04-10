package cz.codingmonkey.utiltitypayment.api;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * @author rstefanca
 */
@Value
@AllArgsConstructor
public class PaymentRegion {
	private final int id;
	private final String name;
	private final String telephoneCode;
}
