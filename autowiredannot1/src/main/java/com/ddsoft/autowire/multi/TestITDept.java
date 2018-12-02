package com.ddsoft.autowire.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestITDept {

	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("multibeans.xml");
		ITDepartment itDept = (ITDepartment) context.getBean("itdept1");
		System.out.println(itDept);
		itDept.handles();
	}

}
