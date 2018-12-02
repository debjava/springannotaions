package com.ddlab.spring.bymethod;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank 
{
	private ICard card;
	
	@Autowired
	public void init( ICard card) {
		this.card = card;
	}
	
//	@Autowired
//	public Vehicle(ICard card) {
//		this.card = card;
//	}
	
	public ICard getCard() {
		return card;
	}
}
