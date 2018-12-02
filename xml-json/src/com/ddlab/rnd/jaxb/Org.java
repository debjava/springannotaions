package com.ddlab.rnd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Org is used to provide information about an Organisation
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlRootElement( name="Org" )
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(propOrder={"name","id","desc","emps"})
public class Org 
{
	
	/**
	 * The id.
	 */
	@XmlElement(name="Id") private String id;
	
	/**
	 * The name.
	 */
	@XmlElement(name="Name") private String name;
	
	/**
	 * The emps.
	 */
	private Employees emps;
	
	/**
	 * The desc.
	 */
	@XmlElement(name="Desc") private Desc desc ;

	/**
	 * Gets the desc.
	 *
	 * @return the desc
	 */
	public Desc getDesc() {
		return desc;
	}

	/**
	 * Sets the desc.
	 *
	 * @param desc the new desc
	 */
	public void setDesc(Desc desc) {
		this.desc = desc;
	}

	/**
	 * Gets the emps.
	 *
	 * @return the emps
	 */
	public Employees getEmps() {
		return emps;
	}

	/**
	 * Sets the emps.
	 *
	 * @param emps the new emps
	 */
	public void setEmps(Employees emps) {
		this.emps = emps;
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
