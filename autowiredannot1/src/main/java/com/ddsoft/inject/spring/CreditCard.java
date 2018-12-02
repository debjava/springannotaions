package com.ddsoft.inject.spring;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class CreditCard 
{
	@Inject  @Qualifier(value="amex")
	ICard card;
	
	public void display()
	{
		System.out.println("Card Name : "+card.getName());
		System.out.println("Card Type : "+card.getType());
	}
}
