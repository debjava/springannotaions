package com.ddsoft.annot.required;

public class Customer 
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	@Mandatory(myValue="check")
//	@Mandatory(myValue="Deba11")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
