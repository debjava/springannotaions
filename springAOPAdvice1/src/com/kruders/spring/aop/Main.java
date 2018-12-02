package com.kruders.spring.aop;
  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
import com.kruders.spring.aop.BusinessService;
  
public class Main {
    public static void main(String args[]) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans2.xml");
        BusinessService businessService = (BusinessService)appContext.getBean("businessServiceProxy");
        try {
            businessService.doSomeThing();
        } catch(ArithmeticException ae) {
              
        }
    }
}