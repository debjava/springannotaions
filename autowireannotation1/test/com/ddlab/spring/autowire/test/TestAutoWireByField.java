package com.ddlab.spring.autowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ddlab.spring.byfield.Vehicle;

public class TestAutoWireByField {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle1");
		//Display Car Details
		System.out.println("Car Name : "+vehicle.getCar().getName());
		System.out.println("Car Type : "+vehicle.getCar().getType());
	}
}
