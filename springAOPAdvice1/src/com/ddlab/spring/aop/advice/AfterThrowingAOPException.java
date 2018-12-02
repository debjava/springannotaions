package com.ddlab.spring.aop.advice;
import org.springframework.aop.ThrowsAdvice;
 
public class AfterThrowingAOPException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Thrown exception hijacked!");
	}
}