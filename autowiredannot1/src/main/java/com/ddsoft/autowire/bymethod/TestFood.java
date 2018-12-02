package com.ddsoft.autowire.bymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFood {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("methodbeans.xml");
		User user = (User) context.getBean("user1");
		user.display();
	}

}
