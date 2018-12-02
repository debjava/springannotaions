package com.ddsoft.autowire.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class SoftwareProduct {
	
	private ILicense license;
	
	@Autowired
	public SoftwareProduct( ILicense license )
	{
		this.license = license;
	}
	
	public void display()
	{
		System.out.println("License Name : "+license.getName());
		System.out.println("License Type : "+license.getType());
	}
}
