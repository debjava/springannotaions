package com.ddsoft.resource;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Vehicle 
{
	@Inject @Resource(name="NormalCarImpl") // This resouce name refers to the xml bean id
	ICar car;
	
	public void display()
	{
		System.out.println("Car Name : "+car.getName());
		System.out.println("Car Type : "+car.getType());
	}
	
	@Inject @Resource(name="PremiumCarImpl") // This resouce name refers to the xml bean id
	ICar premiumCar;
	
	public void show()
	{
		System.out.println("Car Name : "+premiumCar.getName());
		System.out.println("Car Type : "+premiumCar.getType());
	}
	
}
