package com.ddlab.rnd.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class Employees is used is used to provide information about an employee.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
@XmlRootElement( name="Employees")
@XmlAccessorType( XmlAccessType.FIELD )
public class Employees 
{
	
	/**
	 * The emp.
	 */
	@XmlElement(name="Emp") private List<Emp> emp;

	/**
	 * Gets the emp.
	 *
	 * @return the emp
	 */
	public List<Emp> getEmp() {
		return emp;
	}

	/**
	 * Sets the emp.
	 *
	 * @param emp the new emp
	 */
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
}
