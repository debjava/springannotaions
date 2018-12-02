package com.ddlab.spring;

import org.springframework.stereotype.Component;

@Component(value="corporate")
public class CorporateCustomerImpl implements ICustomer {

	public String getName() {
		return "JDA Software Inc.";
	}

	public String getType() {
		return "Corporate";
	}

}
