package com.ddlab.rnd.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Employee is used as a java bean to for the employee details. This
 * class has many JAXB annotations to generate the XML contents from this java
 * object.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlRootElement(name = "Emp")
@XmlType(propOrder = { "id", "name", "proj" })
public class Employee {

	/**
	 * The id.
	 */
	private String id;

	/**
	 * The name.
	 */
	private String name;

	/**
	 * The proj.
	 */
	private Project proj;

	/**
	 * Instantiates a new employee.
	 * 
	 * @param id
	 *            the id
	 */
	public Employee(String id) {
		this.id = id;
	}

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {

	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	@XmlElement(name = "Id")
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
	@XmlElement(name = "Name")
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
	 * Gets the proj.
	 * 
	 * @return the proj
	 */
	@XmlElement(name = "Project")
	public Project getProj() {
		return proj;
	}

	/**
	 * Sets the proj.
	 * 
	 * @param proj
	 *            the new proj
	 */
	public void setProj(Project proj) {
		this.proj = proj;
	}

}
