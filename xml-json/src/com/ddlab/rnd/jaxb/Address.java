package com.ddlab.rnd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * The Class Address is used to provide address details.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Address 
{
	
	/**
	 * The road no.
	 */
	@XmlElement( name="RoadNo") private String roadNo;
	
	/**
	 * The street no.
	 */
	@XmlElement( name="StreetNo") private String streetNo;
	
	/**
	 * The type.
	 */
	@XmlAttribute( name="Type") private String type;
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the road no.
	 *
	 * @return the road no
	 */
	public String getRoadNo() {
		return roadNo;
	}
	
	/**
	 * Sets the road no.
	 *
	 * @param roadNo the new road no
	 */
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	
	/**
	 * Gets the street no.
	 *
	 * @return the street no
	 */
	public String getStreetNo() {
		return streetNo;
	}
	
	/**
	 * Sets the street no.
	 *
	 * @param streetNo the new street no
	 */
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
}
