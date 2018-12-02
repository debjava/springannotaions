package com.ddlab.spring.aop.type1;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class ValidateAfterWithdraw implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnObj, Method method, Object[] methodParams,
			Object target) throws Throwable {
		
		int amount = (int) returnObj;
		System.out.println("Method Name :::"+method.getName());
		if( method.getName().equals("withdrwaMoney")) {
			String actNo = (String) methodParams[0];
			//validate acctNo
			boolean flag = validate(actNo);
			if( !flag ) amount = 0;
		}
		
	}
	
	private boolean validate(String actNo) {
		return false;
	}

}
