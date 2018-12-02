package com.ddlab.spring.aop.type1;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class ValidateBeforeWithdraw implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] methodParams, Object target)
			throws Throwable {
		System.out.println("Method Name :::"+method.getName());
		if( method.getName().equals("withdrwaMoney")) {
			//validate the account no
			String actNo = (String) methodParams[0];
			//validate acctNo
			boolean flag = validate(actNo);
			if( !flag) throw new UnsupportedOperationException();
		}
	}

	private boolean validate(String actNo) {
		return false;
	}
}
