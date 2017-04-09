package cz.codingmonkey.utiltitypayment.controllers;

import com.google.common.collect.ImmutableMap;
import cz.codingmonkey.utiltitypayment.services.UserInfo;
import cz.codingmonkey.utiltitypayment.services.UserInfoService;
import cz.codingmonkey.utiltitypayment.services.UtilityPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping(method = GET, value = "billPayments/paymentGroups")
	@Cacheable({"paymentGroups"})
	public String getPaymentGroups() {
		log.info("getPaymentGroups");
		return "[{\"id\":61,\"name\":\"Utility Payments\"},{\"id\":83796,\"name\":\"Telephone/Internet/TV\"},{\"id\":59635,\"name\":\"Gambling\"},{\"id\":71427,\"name\":\"Shipping & Post\"},{\"id\":152,\"name\":\"Insurance & Pension\"},{\"id\":277964,\"name\":\"Education\"},{\"id\":277966,\"name\":\"Microfinance Companies\"},{\"id\":241849,\"name\":\"Charity\"},{\"id\":154,\"name\":\"Other\"}]";
	}

	@RequestMapping(method = GET, value = "billPayments/paymentRegions")
	public String getPaymentRegions() {
		log.info("getPaymentRegions");
		return "[{\"id\":44,\"name\":\"TBILISI\",\"telephoneCode\":\"32\"},{\"id\":1857,\"name\":\"ABASHA\",\"telephoneCode\":\"412\"},{\"id\":8999,\"name\":\"ADIGENI\",\"telephoneCode\":\"366\"},{\"id\":8997,\"name\":\"AMBROLAURI\",\"telephoneCode\":\"439\"},{\"id\":8994,\"name\":\"ASPINDZA\",\"telephoneCode\":\"364\"},{\"id\":2360,\"name\":\"AKHALKALAKI\",\"telephoneCode\":\"362\"},{\"id\":704,\"name\":\"AKHALTSIKHE\",\"telephoneCode\":\"365\"},{\"id\":9518,\"name\":\"AKHMETA\",\"telephoneCode\":\"349\"},{\"id\":51,\"name\":\"BATUMI\",\"telephoneCode\":\"422\"},{\"id\":9959,\"name\":\"BAGDADI\",\"telephoneCode\":\"434\"},{\"id\":9957,\"name\":\"BOLNISI\",\"telephoneCode\":\"358\"},{\"id\":59,\"name\":\"BORJOMI\",\"telephoneCode\":\"367\"},{\"id\":1966,\"name\":\"GARDABANI\",\"telephoneCode\":\"372\"},{\"id\":57,\"name\":\"GORI\",\"telephoneCode\":\"370\"},{\"id\":1848,\"name\":\"GURJAANI\",\"telephoneCode\":\"353\"},{\"id\":9524,\"name\":\"DEDOPLISTKARO\",\"telephoneCode\":\"356\"},{\"id\":9955,\"name\":\"DMANISI\",\"telephoneCode\":\"360\"},{\"id\":8664,\"name\":\"DUSHETI\",\"telephoneCode\":\"346\"},{\"id\":1974,\"name\":\"VANI\",\"telephoneCode\":\"432\"},{\"id\":1970,\"name\":\"ZESTAPHONI\",\"telephoneCode\":\"492\"},{\"id\":144,\"name\":\"ZUGDIDI\",\"telephoneCode\":\"415\"},{\"id\":9001,\"name\":\"TETRITSKARO\",\"telephoneCode\":\"359\"},{\"id\":55,\"name\":\"TELAVI\",\"telephoneCode\":\"350\"},{\"id\":1972,\"name\":\"TERJOLA\",\"telephoneCode\":\"491\"},{\"id\":8666,\"name\":\"TIANETI\",\"telephoneCode\":\"348\"},{\"id\":1851,\"name\":\"KASPI\",\"telephoneCode\":\"371\"},{\"id\":9522,\"name\":\"LAGODEKHI\",\"telephoneCode\":\"354\"},{\"id\":1859,\"name\":\"LANCHKHUTI\",\"telephoneCode\":\"494\"},{\"id\":2479,\"name\":\"MARNEULI\",\"telephoneCode\":\"357\"},{\"id\":30093,\"name\":\"MARTVILI\",\"telephoneCode\":\"418\"},{\"id\":30381,\"name\":\"MTSKHETA\",\"telephoneCode\":\"373\"},{\"id\":2362,\"name\":\"NINOTSMINDA\",\"telephoneCode\":\"361\"},{\"id\":1866,\"name\":\"OZURGETI\",\"telephoneCode\":\"496\"},{\"id\":53,\"name\":\"RUSTAVI\",\"telephoneCode\":\"341\"},{\"id\":161998,\"name\":\"SAGAREJO\",\"telephoneCode\":\"351\"},{\"id\":1861,\"name\":\"SAMTREDIA\",\"telephoneCode\":\"411\"},{\"id\":2366,\"name\":\"SACHKHERE\",\"telephoneCode\":\"435\"},{\"id\":1855,\"name\":\"SENAKI\",\"telephoneCode\":\"413\"},{\"id\":146,\"name\":\"SIGNAGI\",\"telephoneCode\":\"355\"},{\"id\":9961,\"name\":\"STEPANTSMINDA\",\"telephoneCode\":\"345\"},{\"id\":9005,\"name\":\"TKIBULI\",\"telephoneCode\":\"497\"},{\"id\":49,\"name\":\"POTI\",\"telephoneCode\":\"493\"},{\"id\":2364,\"name\":\"KARELI\",\"telephoneCode\":\"369\"},{\"id\":1960,\"name\":\"KEDA\",\"telephoneCode\":\"425\"},{\"id\":1958,\"name\":\"KOBULETI\",\"telephoneCode\":\"426\"},{\"id\":47,\"name\":\"KUTAISI\",\"telephoneCode\":\"431\"},{\"id\":9516,\"name\":\"KVARELI\",\"telephoneCode\":\"352\"},{\"id\":1962,\"name\":\"SHUAKHEVI\",\"telephoneCode\":\"424\"},{\"id\":38220,\"name\":\"CHOKHATAURI\",\"telephoneCode\":\"419\"},{\"id\":38222,\"name\":\"CHKHOROTSKU\",\"telephoneCode\":\"417\"},{\"id\":9007,\"name\":\"TSAGERI\",\"telephoneCode\":\"472\"},{\"id\":38218,\"name\":\"TSALENJIKHA\",\"telephoneCode\":\"416\"},{\"id\":9003,\"name\":\"TSALKA\",\"telephoneCode\":\"363\"},{\"id\":706,\"name\":\"TSKALTUBO\",\"telephoneCode\":\"436\"},{\"id\":9953,\"name\":\"CHIATURA\",\"telephoneCode\":\"479\"},{\"id\":1863,\"name\":\"KHARAGAULI\",\"telephoneCode\":\"433\"},{\"id\":701,\"name\":\"KHASHURI\",\"telephoneCode\":\"368\"},{\"id\":30091,\"name\":\"KHOBI\",\"telephoneCode\":\"414\"},{\"id\":8668,\"name\":\"KHONI\",\"telephoneCode\":\"495\"},{\"id\":1964,\"name\":\"KHULO\",\"telephoneCode\":\"423\"}]";
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
