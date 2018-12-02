package com.ddsoft.inject.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreditCard {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("injectbeans.xml");
		CreditCard cc = (CreditCard) context.getBean("creditcard1");
		cc.display();
	}

}
