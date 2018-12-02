package com.ddsoft.inject.named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPayment {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("namedbean.xml");
		Payment payment = (Payment) context.getBean("payment1");
		payment.display();
		payment.show();
	}

}
