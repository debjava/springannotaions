package com.ddlab.aop.pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPClient
{

    public static void main(String[] args)
    {
        ApplicationContext context = 
  new ClassPathXmlApplicationContext("beans1.xml");
        ArithmeticCalculator calculator = 
  (ArithmeticCalculator) context.getBean("arithmeticCalculator");
        double sum = calculator.add(12, 23);
        System.out.println(sum);
        double div = calculator.div(1, 10);
        System.out.println(div);
    }

}