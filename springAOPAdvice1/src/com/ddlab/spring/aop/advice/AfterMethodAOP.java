package com.ddlab.spring.aop.advice;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
 
public class AfterMethodAOP implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
		Object[] args, Object target) throws Throwable {
	        System.out.println("HijackAfterMethod : After method hijacked!");
	}
}