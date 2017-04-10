package cz.codingmonkey.utiltitypayment.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import cz.codingmonkey.utiltitypayment.api.PaymentGroup;
import cz.codingmonkey.utiltitypayment.api.PaymentRegion;
import cz.codingmonkey.utiltitypayment.services.FrequentPaymentClient;
import cz.codingmonkey.utiltitypayment.services.UserInfo;
import cz.codingmonkey.utiltitypayment.services.UserInfoService;
import cz.codingmonkey.utiltitypayment.services.UtilityPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * @author rstefanca
 */
@RestController
@RequestMapping(value = "/delegate/rest/ups/v1/")
public class UpsController {

	private static Logger log = LoggerFactory.getLogger(UpsController.class);

	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private UtilityPaymentService utilityPaymentService;

	@Autowired
	private FrequentPaymentClient frequentPaymentClient;

	@Autowired
	private ObjectMapper objectMapper;

	/**
	 * Returns String representing Payment Groups JSON. String is used on purpose to cache already
	 * serialized result instead serializing cached object each method invocation. It saves a few
	 * cpu cycles :)
	 *
	 * @return JSON string
	 * @throws Exception if serialization fails
	 */
	@RequestMapping(method = GET, value = "billPayments/paymentGroups")
	@Cacheable({"paymentGroups"})
	public String getPaymentGroups() throws Exception {
		log.info("getPaymentGroups");
		Collection<PaymentGroup> paymentGroups = frequentPaymentClient.getPaymentGroups();
		return objectMapper.writeValueAsString(paymentGroups);
	}

	@RequestMapping(method = GET, value = "billPayments/paymentRegions")
	@Cacheable({"paymentRegions"})
	public String getPaymentRegions(@RequestParam(value = "paymentGroupId", required = false) Integer paymentGroupId) throws Exception {
		log.info("getPaymentRegions");
		Collection<PaymentRegion> paymentRegions = frequentPaymentClient.getPaymentRegions(paymentGroupId);
		return objectMapper.writeValueAsString(paymentRegions);
	}

	@RequestMapping(method = GET, value = "billPayments")
	public String billPayments(@CookieValue("JSESSIONID") String sessionId) {
		log.info("Session id: {}", sessionId);
		UserInfo userInfo = userInfoService.getUserInfo(sessionId);
		log.info("User: " + userInfo);
		//log.info("Payment list order: {}", StringUtils.join(utilityPaymentService.getPaymentListOrder(123456), ","));

		return "[{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178800,\"paymentProduct\":{\"id\":218552,\"name\":\"MIA_SA Service Fee (MIASASERV)\",\"description\":\"MIA_SA Service Fee\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":41746,\"name\":\"MIA's Service Agency\",\"shortName\":\"MIA_SA\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":154},\"paymentIdentifier\":\"123\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178801,\"paymentProduct\":{\"id\":373548,\"name\":\"Nasamartleobis cnoba\",\"description\":\"Nasamartleobis cnoba\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":41746,\"name\":\"MIA's Service Agency\",\"shortName\":\"MIA_SA\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":154},\"paymentIdentifier\":\"123213\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178781,\"paymentProduct\":{\"id\":115,\"name\":\"DASUPTAVEB\",\"description\":\"DASUPTAVEB\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":114,\"name\":\"Dasuftaveb\",\"shortName\":\"Dasuftaveb\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":61},\"paymentIdentifier\":\"1656425\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178655,\"paymentProduct\":{\"id\":241864,\"name\":\"Solidarity Fund\",\"description\":\"Submit ID and Name and Surname\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":241837,\"name\":\"Solidarity Fund\",\"shortName\":\"სოლიდარობის ფონდი\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":true,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":241849},\"paymentIdentifier\":\"454\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178654,\"paymentProduct\":{\"id\":221212,\"name\":\"MYVIDEO Balance refill\",\"description\":\"Please, indicate customer ID Or e-mail :\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":221211,\"name\":\"MYVIDEO\",\"shortName\":\"MYVIDEO\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":83796},\"paymentIdentifier\":\"200040\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178803,\"paymentProduct\":{\"id\":218549,\"name\":\"VAT (MIASATRVAT)\",\"description\":\"For payment please, select \\\"MIASA group payment service (MIASAGROUP)\\\"\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":41746,\"name\":\"MIA's Service Agency\",\"shortName\":\"MIA_SA\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":154},\"paymentIdentifier\":\"21312\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null},{\"verifyStatus\":\"UNVERIFIED\",\"message\":null,\"abonentInfo\":null,\"debt\":0.0,\"paymentProducts\":null,\"id\":4178802,\"paymentProduct\":{\"id\":218550,\"name\":\"Import Tax (MIASATRIMP)\",\"description\":\"For payment please, select \\\"MIASA group payment service (MIASAGROUP)\\\"\",\"paymentRegions\":[],\"allowedPaymentAmounts\":null,\"instruction\":null,\"serviceProvider\":{\"id\":41746,\"name\":\"MIA's Service Agency\",\"shortName\":\"MIA_SA\"},\"phoneNumberIdentifier\":false,\"directDebitPaymentType\":null,\"directDebitVariablePaymentType\":null,\"directDebitPriorityModifAllowed\":null,\"offline\":false,\"payOnlyDebtAmount\":false,\"ddComment\":null,\"needsCertification\":false,\"mobilePackage\":false,\"paymentGroupId\":154},\"paymentIdentifier\":\"103\",\"treasuryCode\":null,\"description\":null,\"isOwnPaymentIdentifier\":null}]";
	}

	@RequestMapping(method = PUT, value = "billPayments/order")
	public Map<String, String> saveFrequentPaymentsOrder(@RequestBody List<Integer> frequentPaymentIds) {

		//utilityPaymentService.savePaymentOrder(123456, frequentPaymentIds);


		return ImmutableMap.of("success", "true");
	}
}
