package com.ddsoft.autowire.multi;

import org.springframework.stereotype.Component;

@Component(value="hotel")
public class HotelOrganisationImpl implements IOrganisation {

	public String getName() {
		return "Taj Residency";
	}

	public String getType() {
		return "Hospitality";
	}

}
