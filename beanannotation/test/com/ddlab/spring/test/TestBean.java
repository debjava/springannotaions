package com.ddlab.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ddlab.spring.AppConfig;
import com.ddlab.spring.Laptop;

public class TestBean {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop laptop = (Laptop) context.getBean("lenovo");
		System.out.println("Laptop Name : "+laptop.getName());
	}
}
