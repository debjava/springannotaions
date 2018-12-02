package com.ddsoft.rnd.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans1.xml");
		Organisation org = (Organisation) context.getBean("org");
		System.out.println(org.getEmp().getId());
	}

}
