package com.ddsoft.autowire.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestITDept {

	public static void main(String[] args) 
	{
		ApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AutowireMultiConfig.class);
		ITDepartment itDept = (ITDepartment) context.getBean("itdept1");
		System.out.println(itDept);
		itDept.handles();
	}

}
