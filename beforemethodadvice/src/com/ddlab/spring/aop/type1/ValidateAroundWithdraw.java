package com.ddlab.spring.aop.type1;

import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ValidateAroundWithdraw implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		System.out.println("Method name : "+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
		Object[] methodParams = methodInvocation.getArguments();
		String actNo = (String) methodParams[0]; 
		int withdrawAmount = (int) methodParams[1];
		System.out.println("HijackAroundMethod : Before method hijacked!");
		 
		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();
			System.out.println("Expected Result before validation --------->"+result);
			//Now validate the account No
			boolean flag = validate(actNo);
			if( !flag ) withdrawAmount = 0;
			result = withdrawAmount;
			return result;
 
		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
	
	private boolean validate(String actNo) {
		return false;
	}
}
