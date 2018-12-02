package com.ddsoft.autowire.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGovt1 {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("multibeans.xml");
		Government govt1 = (Government) context.getBean("govt1");
		System.out.println(govt1);
		govt1.dealsWith();
		

	}

}
