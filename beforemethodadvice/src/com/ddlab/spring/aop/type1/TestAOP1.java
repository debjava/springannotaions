package com.ddlab.spring.aop.type1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP1 {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "beans.xml" });
		Account act = (Account) appContext.getBean("accountProxy");
		int amount = act.withdrwaMoney("123456", 200);
		System.out.println("I got the money : "+amount);
	}

}
