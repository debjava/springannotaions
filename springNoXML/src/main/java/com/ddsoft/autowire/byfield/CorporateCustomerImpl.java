package com.ddsoft.autowire.byfield;

import org.springframework.stereotype.Component;

@Component(value="corporate")
public class CorporateCustomerImpl implements ICustomer {

	public String getName() {
		return "IdealInvent";
	}

	public String getType() {
		return "Corporate";
	}

}
