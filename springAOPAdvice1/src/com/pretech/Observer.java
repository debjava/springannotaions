package com.pretech; 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Observer {
	/** 
	 * This method will execute before executing any method in side com.pretech package
	 */
	@Before("execution(* com.pretech.*.*(..))")
	public void beforeAdvice(JoinPoint jp){
		System.out.println("Creating  object"+jp.getTarget().getClass().getName());
	}
	/** 
	 * This method will execute after executing any method
	 */
	@After("execution(* com.pretech.*.*(..))") 
	public void afterAdvice(JoinPoint jp){
		System.out.println("Created  object"+jp.getTarget().getClass().getName());
	}
} 