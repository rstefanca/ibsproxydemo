package cz.codingmonkeys.smartclub.api;

import lombok.Value;

import java.math.BigDecimal;

/**
 * @author Richard Stefanca
 */

@Value
public class SmartClubInfo {

	private boolean isMember;
	private BigDecimal points;

}
