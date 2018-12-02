package com.ddsoft.inject.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDebitCard 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("injectbeans.xml");
		DebitCard dc = (DebitCard) context.getBean("debitcard1");
		dc.display();
		dc.show();
		dc.show1();
	}
}
