package com.ddlab.rnd.beans;

/**
 * The Class Account is a plain java POJO class for the account details.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 *         Since 2013
 */
public class Account {

	/** The act no. */
	private String actNo;

	/** The act type. */
	private String actType;

	/**
	 * Gets the act no.
	 * 
	 * @return the act no
	 */
	public String getActNo() {
		return actNo;
	}

	/**
	 * Sets the act no.
	 * 
	 * @param actNo
	 *            the new act no
	 */
	public void setActNo(String actNo) {
		this.actNo = actNo;
	}

	/**
	 * Gets the act type.
	 * 
	 * @return the act type
	 */
	public String getActType() {
		return actType;
	}

	/**
	 * Sets the act type.
	 * 
	 * @param actType
	 *            the new act type
	 */
	public void setActType(String actType) {
		this.actType = actType;
	}

}
