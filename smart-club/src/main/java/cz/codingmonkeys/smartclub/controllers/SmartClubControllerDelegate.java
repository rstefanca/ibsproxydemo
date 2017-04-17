package cz.codingmonkeys.smartclub.controllers;

import cz.codingmonkeys.smartclub.api.SmartClubInfo;
import cz.codingmonkeys.smartclub.integration.SmartClubClient;
import cz.codingmonkeys.smartclub.services.UserInfo;
import cz.codingmonkeys.smartclub.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Richard Stefanca
 */
@Component
public class SmartClubControllerDelegate {

	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private SmartClubClient smartClubClient;

	public SmartClubInfo getSmartClubInfo(String sessionId) {
		UserInfo userInfo = userInfoService.getUserInfo(sessionId);
		long externalClientId = Long.parseLong(userInfo.getExternalClientId());
		return smartClubClient.getSmartClubInfo(externalClientId);
	}
}
