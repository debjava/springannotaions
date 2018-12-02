package com.ddsoft.inject.named;

import javax.inject.Inject;
import javax.inject.Named;

public class Payment 
{
	@Inject @Named("CashPayment")
	IPayment pay ;
	
	public void display()
	{
		System.out.println("Payment Name : "+pay.getName());
		System.out.println("Payment Type : "+pay.getType());
	}
	
	@Inject @Named("CardPayment")
	IPayment cardPay ;
	
	public void show()
	{
		System.out.println("Payment Name : "+cardPay.getName());
		System.out.println("Payment Type : "+cardPay.getType());
	}
}
