package com.ddlab.rnd.beans;

/**
 * This class is used as a java bean for the customer details.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @Since 2013
 */
public class Customer {

	/** The id. */
	private String id;

	/** The name. */
	private String name;

	/** The act. */
	private Account act;

	/**
	 * Gets the act.
	 * 
	 * @return the act
	 */
	public Account getAct() {
		return act;
	}

	/**
	 * Sets the act.
	 * 
	 * @param act
	 *            the new act
	 */
	public void setAct(Account act) {
		this.act = act;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
