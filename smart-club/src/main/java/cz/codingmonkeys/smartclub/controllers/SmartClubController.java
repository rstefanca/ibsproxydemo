package cz.codingmonkeys.smartclub.controllers;

import cz.codingmonkeys.smartclub.api.SmartClubInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Richard Stefanca
 */
@RestController
@RequestMapping(value = "/rest/smartclub/v1/")
public class SmartClubController {

	@Autowired
	private SmartClubControllerDelegate delegate;

	@RequestMapping(method = GET, value = "info")
	public SmartClubInfo smartClubInfo(@CookieValue("JSESSIONID") String sessionId) {
		return delegate.getSmartClubInfo(sessionId);
	}
}
