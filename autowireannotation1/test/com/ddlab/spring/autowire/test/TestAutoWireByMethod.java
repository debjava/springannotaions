package com.ddlab.spring.autowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ddlab.spring.bymethod.Bank;

public class TestAutoWireByMethod {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Bank bank = (Bank) context.getBean("bank");
		//Display Card Details
		System.out.println("Card Name : "+bank.getCard().getName());
		System.out.println("Card Type : "+bank.getCard().getType());
	}
}
