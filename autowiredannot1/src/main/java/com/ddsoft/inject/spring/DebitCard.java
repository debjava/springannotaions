package com.ddsoft.inject.spring;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class DebitCard 
{
	@Inject @Qualifier(value="hdfc")
	ICard card;
	
	public void display()
	{
		System.out.println("Card Name : "+card.getName());
		System.out.println("Card Type : "+card.getType());
	}
	
	@Inject @Platinum 
	ICard mycard ;
	
	public void show(  )
	{
		System.out.println("Card Name : "+mycard.getName());
		System.out.println("Card Type : "+mycard.getType());
	}
	
	@Inject @Default()
	ICard goldCard;
	
	public void show1()
	{
		System.out.println("Card Name : "+goldCard.getName());
		System.out.println("Card Type : "+goldCard.getType());
	}
}
