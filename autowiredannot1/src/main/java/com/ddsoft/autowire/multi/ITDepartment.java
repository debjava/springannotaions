package com.ddsoft.autowire.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ITDepartment 
{
	private IOrganisation org;
	
	@Autowired
	public void init( @Qualifier("it") IOrganisation org )
	{
		this.org = org;
	}
	
	public void handles()
	{
		System.out.println("Organisation Name : "+org.getName());
		System.out.println("Type of Organisation : "+org.getType());
	}
}
