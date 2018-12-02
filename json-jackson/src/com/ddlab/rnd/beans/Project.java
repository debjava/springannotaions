package com.ddlab.rnd.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Project is used is used as a java bean for the generation of xml
 * contents from this object with the help of JAXB annotations.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlRootElement(name = "Project")
public class Project {

	/**
	 * The name.
	 */
	@XmlElement(name = "ProjectName")
	private String name;

	/**
	 * The id.
	 */
	@XmlElement(name = "ProjectId")
	private String id;

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
