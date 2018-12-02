package com.aop.pointcut1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {
    
    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinpoint)
    {
        System.out.println("Run Advice..... get method Executed");
        System.out.println(joinpoint.toString());
        System.out.println("----------"+joinpoint.getTarget());
        ShapeService shape = (ShapeService) joinpoint.getTarget();
        System.out.println(shape.getCircle().getName());
    }
    
//    @Before("args(name)")
//    public void allStringMethodArguments(String name){
//        
//        System.out.println("A setter method has been executed............"+name);
//    }
    
    @Before("args(String)")
    public void allStringMethodArguments(){
    
    System.out.println("A setter method has been executed............");
    }
    
    
    
    @Pointcut("within(com.aop.pointcut1.*)")
    public void allCircleMethods(){}
    
    

}