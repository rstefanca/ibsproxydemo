package cz.codingmonkey.utiltitypayment.api;

/**
 * @author rstefanca
 */
public class IdAndName {

	private final int id;
	private final String name;

	public IdAndName(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
