package com.pretech; 
public class Employee {
	public Employee() {
		System.out.println("Employee constructor executed");
	} 
	private String name;
	private String company; 
	public void setName(String name) {
		this.name = name;
	} 
	public String getName() {
		return name;
	} 
	public String getCompany() {
		return company;
	} 
	public void setCompany(String company) {
		this.company = company;
	} 
} 