package com.ddlab.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="bank1")
public class Bank 
{
	@Autowired @Qualifier(value="retail") //@Qualifier(value="corporate")
	private ICustomer customer;
	
	public void display()
	{
		System.out.println("Customer Name : "+customer.getName());
		System.out.println("Customer Type : "+customer.getType());
	}
}
