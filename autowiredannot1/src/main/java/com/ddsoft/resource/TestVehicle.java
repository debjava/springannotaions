package com.ddsoft.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("resourcebean.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle1");
		vehicle.display();
		vehicle.show();
	}

}
