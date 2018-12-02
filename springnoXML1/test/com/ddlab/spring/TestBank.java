package com.ddlab.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(SpringNoXMLConfig.class);
		Bank bank = (Bank) context.getBean("bank1");
		bank.display();
	}

}
