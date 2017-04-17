package cz.codingmonkeys.smartclub.services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @author rstefanca
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UserInfo implements Serializable {


	private String externalClientId;
	private String username;


}
