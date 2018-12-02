package com.ddsoft.autowire.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="itdept1")
public class ITDepartment 
{
	private IOrganisation org;
	
	@Autowired
	public void init( @Qualifier("itorg") IOrganisation org )
	{
		this.org = org;
	}
	
	public void handles()
	{
		System.out.println("Organisation Name : "+org.getName());
		System.out.println("Type of Organisation : "+org.getType());
	}
}
