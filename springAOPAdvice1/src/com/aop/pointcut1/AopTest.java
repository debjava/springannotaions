package com.aop.pointcut1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
        ShapeService service=context.getBean("shapeService",ShapeService.class);
        service.getCircle().setName("Dummy Circle");
        System.out.println(service.getCircle().getName());
    }
}