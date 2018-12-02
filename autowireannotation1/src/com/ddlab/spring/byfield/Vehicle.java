package com.ddlab.spring.byfield;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle 
{
	@Autowired
	private ICar car;
	
	public ICar getCar() {
		return car;
	}
}
