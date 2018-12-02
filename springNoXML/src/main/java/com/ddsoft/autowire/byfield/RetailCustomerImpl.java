package com.ddsoft.autowire.byfield;

import org.springframework.stereotype.Component;

@Component(value="retail")
public class RetailCustomerImpl implements ICustomer {

	public String getName() {
		return "John Abraham";
	}

	public String getType() {
		return "Retail";
	}

}
