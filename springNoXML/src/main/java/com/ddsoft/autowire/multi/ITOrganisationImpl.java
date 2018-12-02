package com.ddsoft.autowire.multi;

import org.springframework.stereotype.Component;

@Component("itorg")
public class ITOrganisationImpl implements IOrganisation {

	public String getName() {
		return "IdealInvent Technologies";
	}

	public String getType() {
		return "Software Firm";
	}

}
