package cz.codingmonkey.utiltitypayment.api;

import com.fasterxml.jackson.annotation.*;
import lombok.Builder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"id",
		"name",
		"shortName"
})
@Builder
public class ServiceProvider implements Serializable
{

	@JsonProperty("id")
	public int id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("shortName")
	public String shortName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7087173370330345873L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}