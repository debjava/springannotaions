package com.ddlab.rnd.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The Class Emp is used to provide the information about the list of employees.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlAccessorType( XmlAccessType.FIELD )
public class Emp 
{
	
	/**
	 * The id.
	 */
	@XmlElement( name="Id") private String id;
	
	/**
	 * The name.
	 */
	@XmlElement( name="Name") private String name;
	
	/**
	 * The adrs.
	 */
	@XmlElement( name="Address") private List<Address> adrs;
	
	/**
	 * Gets the adrs.
	 *
	 * @return the adrs
	 */
	public List<Address> getAdrs() {
		return adrs;
	}
	
	/**
	 * Sets the adrs.
	 *
	 * @param adrs the new adrs
	 */
	public void setAdrs(List<Address> adrs) {
		this.adrs = adrs;
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
	 * @param id the new id
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
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
