package com.ddlab.rnd.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestProperty {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
