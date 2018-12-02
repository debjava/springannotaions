package com.ddlab.spring.bymethod;

public class DebitCardImpl implements ICard 
{

	public String getName() {
		return "Gold Card";
	}

	public String getType() {
		return "Debit Card";
	}
	
}
