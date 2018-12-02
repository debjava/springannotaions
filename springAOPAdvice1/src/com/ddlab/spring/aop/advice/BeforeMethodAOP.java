package com.ddlab.spring.aop.advice;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeMethodAOP implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked!");
		System.out.println("Before Method Execution ....");
		System.out.println(target);//Refers to target object
	}
}