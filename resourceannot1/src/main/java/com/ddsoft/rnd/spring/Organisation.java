package com.ddsoft.rnd.spring;

import javax.annotation.Resource;

public class Organisation 
{
	@Resource
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
