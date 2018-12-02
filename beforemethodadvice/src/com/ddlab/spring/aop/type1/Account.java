package com.ddlab.spring.aop.type1;

public class Account {
	
	public int withdrwaMoney(String accountNo , int amount ) {
		System.out.println("Going to withdraw money .....");
		//Get total available balance from account
		int totalBalance = 5000;
		if( (totalBalance - amount) >= 0 )
			return amount;
		else return 0;
	}

}
