package com.ddsoft.autowire.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ddsoft.autowire.byfield.AutowireFieldConfig;

public class TestGovt1 {

	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AutowireMultiConfig.class);
		Government govt1 = (Government) context.getBean("govt1");
		System.out.println(govt1);
		govt1.dealsWith();
		

	}

}
