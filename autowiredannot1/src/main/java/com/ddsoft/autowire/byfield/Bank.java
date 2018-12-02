package com.ddsoft.autowire.byfield;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank 
{
	@Autowired
	private ICustomer customer;
	
	public void display()
	{
		System.out.println("Customer Name : "+customer.getName());
		System.out.println("Customer Type : "+customer.getType());
	}
}
