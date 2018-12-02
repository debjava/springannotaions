package com.ddlab.rnd.beans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Class Person is used is used as a java bean for the person details and it
 * provides json annotation to generate json contents with the custom json field
 * property.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Person {

	/**
	 * The name.
	 */
	@JsonProperty(value = "Name")
	private String name;

	/**
	 * The id.
	 */
	@JsonProperty(value = "Id")
	private String id;

	/**
	 * The adrs.
	 */
	@JsonProperty(value = "Address")
	private Address adrs;

	/**
	 * Gets the adrs.
	 * 
	 * @return the adrs
	 */
	public Address getAdrs() {
		return adrs;
	}

	/**
	 * Sets the adrs.
	 * 
	 * @param adrs
	 *            the new adrs
	 */
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
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
}
