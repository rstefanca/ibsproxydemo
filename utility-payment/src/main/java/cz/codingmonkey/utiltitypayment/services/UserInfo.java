package cz.codingmonkey.utiltitypayment.services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author rstefanca
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo implements Serializable {

	private String firstName;
	private String lastName;
	private String externalClientId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getExternalClientId() {
		return externalClientId;
	}

	public void setExternalClientId(String externalClientId) {
		this.externalClientId = externalClientId;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserInfo{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", externalClientId='").append(externalClientId).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
