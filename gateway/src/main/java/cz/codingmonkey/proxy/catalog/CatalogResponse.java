package cz.codingmonkey.proxy.catalog;

import lombok.Value;

import java.io.Serializable;

/**
 * @author Richard Stefanca
 */

@Value
public class CatalogResponse implements Serializable {
	private String content;
	private boolean error = false;
	private String message;
}
