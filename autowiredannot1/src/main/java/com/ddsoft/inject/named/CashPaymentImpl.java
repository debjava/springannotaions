package com.ddsoft.inject.named;

import javax.inject.Named;

@Named(value="CashPayment")
public class CashPaymentImpl implements IPayment 
{

	public String getName() {
		return "Cash Payment";
	}

	public String getType() {
		return "Cash";
	}

}
