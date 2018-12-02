package com.ddsoft.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestLicense {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("constructorbeans.xml");
		SoftwareProduct swProduct = (SoftwareProduct) context.getBean("swProd1");
		swProduct.display();
	}

}
