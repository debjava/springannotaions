package com.ddsoft.autowire.byfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("fieldbeans.xml");
		Bank bank = (Bank) context.getBean("bank1");
		bank.display();
	}

}
