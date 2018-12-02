package com.ddsoft.autowire.multi;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="govt1")
public class Government 
{
	private IOrganisation org;

	@Autowired
	public void prepare( @Qualifier("hotel") IOrganisation org )
	{
		this.org = org;
	}
	
	public IOrganisation getOrg() {
		return org;
	}
	
	public void dealsWith( )
	{
		System.out.println("Organisation Name : "+org.getName());
		System.out.println("Type of Organisation : "+org.getType());
	}
	
}
