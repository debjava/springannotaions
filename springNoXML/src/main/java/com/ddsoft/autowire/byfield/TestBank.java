package com.ddsoft.autowire.byfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AutowireFieldConfig.class);
		Bank bank = (Bank) context.getBean("bank1");
		bank.display();
	}

}
