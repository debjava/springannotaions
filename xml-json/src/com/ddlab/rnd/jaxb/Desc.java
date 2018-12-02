package com.ddlab.rnd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * The Class Desc is used to provide description about the unit and type
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Desc
{
	
	/**
	 * The unit.
	 */
	@XmlAttribute(name="unit") private String unit;
	
	/**
	 * The type.
	 */
	@XmlAttribute(name="type") private String type;
	
	/**
	 * The value.
	 */
	@XmlValue() private String value;
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Gets the unit.
	 *
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * Sets the unit.
	 *
	 * @param unit the new unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
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
	
}
