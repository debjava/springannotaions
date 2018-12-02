package com.ddsoft.inject.named;

import javax.inject.Named;

@Named(value="CardPayment")
public class CardPaymentImpl implements IPayment 
{

	public String getName() {
		return "Card Payment";
	}

	public String getType() {
		return "Card";
	}

}
