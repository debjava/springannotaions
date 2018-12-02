package com.ddsoft.autowire.bymethod;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	private IFood food;
	
	@Autowired
	public void init( IFood food )
	{
		this.food = food;
	}
	
	public void display()
	{
		System.out.println("Food Name : "+food.getName());
		System.out.println("Food Type : "+food.getType());
	}

}
