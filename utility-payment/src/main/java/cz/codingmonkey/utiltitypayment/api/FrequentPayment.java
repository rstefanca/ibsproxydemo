package cz.codingmonkey.utiltitypayment.api;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Richard Stefanca
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"verifyStatus",
		"message",
		"abonentInfo",
		"debt",
		"paymentProducts",
		"id",
		"paymentProduct",
		"paymentIdentifier",
		"treasuryCode",
		"description",
		"isOwnPaymentIdentifier"
})
public class FrequentPayment {
	@JsonProperty("verifyStatus")
	public String verifyStatus;
	@JsonProperty("message")
	public String message;
	@JsonProperty("abonentInfo")
	public String abonentInfo;
	@JsonProperty("debt")
	public double debt;
	@JsonProperty("paymentProducts")
	public Object paymentProducts;
	@JsonProperty("id")
	public int id;
	@JsonProperty("paymentProduct")
	public PaymentProduct paymentProduct;
	@JsonProperty("paymentIdentifier")
	public String paymentIdentifier;
	@JsonProperty("treasuryCode")
	public String treasuryCode;
	@JsonProperty("description")
	public String description;
	@JsonProperty("isOwnPaymentIdentifier")
	public String isOwnPaymentIdentifier;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2616749913969412154L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
