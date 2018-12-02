package com.ddlab.spring.aop.advice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void executeBeforeMethodAOP() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "beans.xml" });
		CustomerService beforeCust = (CustomerService) appContext.getBean("beforecustomerServiceProxy");
		System.out.println("*************************");
		beforeCust.printName();
		System.out.println("*************************");
		beforeCust.printURL();
		System.out.println("*************************");
	}

	public static void executeAfterMethodAOP() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "beans.xml" });
		CustomerService afterCust = (CustomerService) appContext.getBean("aftercustomerServiceProxy");
		System.out.println("*************************");
		afterCust.printName();
		System.out.println("*************************");
		afterCust.printURL();
		System.out.println("*************************");
	}

	public static void executeAfterThrowingMethodAOP() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "beans.xml" });
		CustomerService afterThrowingCust = (CustomerService) appContext.getBean("throwingcustomerServiceProxy");
		System.out.println("*************************");
		afterThrowingCust.printName();
		System.out.println("*************************");
		afterThrowingCust.printURL();
		System.out.println("*************************");
		try {
			afterThrowingCust.printThrowException();
		} catch (Exception e) {

		}
	}

	public static void executeAroundServiceMethodAOP() {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(	new String[] { "beans.xml" });
		CustomerService aroundCust = (CustomerService) appContext.getBean("aroundcustomerServiceProxy");
		System.out.println("*************************");
		aroundCust.printName();
		System.out.println("*************************");
		aroundCust.printURL();
		System.out.println("*************************");
	}
	public static void main(String[] args) {
		
		executeBeforeMethodAOP();

		executeAfterMethodAOP();

		executeAfterThrowingMethodAOP();

		executeAroundServiceMethodAOP();

	}
}