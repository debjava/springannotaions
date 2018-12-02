package com.ddlab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpRequiredAnnot1 {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");

		Employee emp = (Employee) context.getBean("employee");
		System.out.println("Name : " + emp.getName() );
		System.out.println("Age : " + emp.getAge() );

	}

}
