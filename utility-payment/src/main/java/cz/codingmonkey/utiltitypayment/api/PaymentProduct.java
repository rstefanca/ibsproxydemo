package cz.codingmonkey.utiltitypayment.api;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"id",
		"name",
		"description",
		"paymentRegions",
		"allowedPaymentAmounts",
		"instruction",
		"serviceProvider",
		"phoneNumberIdentifier",
		"directDebitPaymentType",
		"directDebitVariablePaymentType",
		"directDebitPriorityModifAllowed",
		"offline",
		"payOnlyDebtAmount",
		"ddComment",
		"needsCertification",
		"mobilePackage",
		"paymentGroupId"
})
public class PaymentProduct implements Serializable
{

	@JsonProperty("id")
	public int id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("description")
	public String description;
	@JsonProperty("paymentRegions")
	public List<Object> paymentRegions = null;
	@JsonProperty("allowedPaymentAmounts")
	public Object allowedPaymentAmounts;
	@JsonProperty("instruction")
	public Object instruction;
	@JsonProperty("serviceProvider")
	public ServiceProvider serviceProvider;
	@JsonProperty("phoneNumberIdentifier")
	public boolean phoneNumberIdentifier;
	@JsonProperty("directDebitPaymentType")
	public Object directDebitPaymentType;
	@JsonProperty("directDebitVariablePaymentType")
	public Object directDebitVariablePaymentType;
	@JsonProperty("directDebitPriorityModifAllowed")
	public Object directDebitPriorityModifAllowed;
	@JsonProperty("offline")
	public boolean offline;
	@JsonProperty("payOnlyDebtAmount")
	public boolean payOnlyDebtAmount;
	@JsonProperty("ddComment")
	public Object ddComment;
	@JsonProperty("needsCertification")
	public boolean needsCertification;
	@JsonProperty("mobilePackage")
	public boolean mobilePackage;
	@JsonProperty("paymentGroupId")
	public int paymentGroupId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2634129088405483827L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
