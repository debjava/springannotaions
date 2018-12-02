package com.ddsoft.inject.spring;

import javax.enterprise.inject.Default;

@Default
public class GoldCardImpl implements ICard 
{

	public String getName() {
		return "Gold Debit Card";
	}

	public String getType() {
		return "Gold Card";
	}
	
}
