package com.ddlab.rnd.beans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * The Class Address is used as java bean for the address details.
 * This class provides Json annotation property to generate the json
 * from this object.
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * Since 2013
 */
public class Address {

	/** The street name. */
	@JsonProperty(value = "StreetName")
	private String streetName;

	/** The house no. */
	@JsonProperty(value = "HNo")
	private String houseNo;

	/** The pin. */
	@JsonProperty(value = "Pin")
	private String pin;

	/** The country. */
	@JsonProperty(value = "Country")
	private String country;

	/**
	 * Gets the street name.
	 * 
	 * @return the street name
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the street name.
	 * 
	 * @param streetName
	 *            the new street name
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Gets the house no.
	 * 
	 * @return the house no
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * Sets the house no.
	 * 
	 * @param houseNo
	 *            the new house no
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * Gets the pin.
	 * 
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * Sets the pin.
	 * 
	 * @param pin
	 *            the new pin
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}

	/**
	 * Gets the country.
	 * 
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 * 
	 * @param country
	 *            the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
