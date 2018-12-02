package com.ddlab.test;

import java.io.StringWriter;

import org.codehaus.jackson.map.ObjectMapper;

import com.ddlab.spring.rest.beans.Account;
import com.ddlab.spring.rest.beans.Address;
import com.ddlab.spring.rest.beans.Employee;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		Address adrs = new Address();
		adrs.setCountryName("India");
		adrs.setStreetName("Bangalore");
		
		Account act = new Account();
		act.setActNo("11111");
		act.setName("DD Mishra");
		
		Employee emp = new Employee();
		emp.setId("Id1");
		emp.setName("Name-1");
		emp.setAdrs(adrs);
		emp.setAct(act);
		
		ObjectMapper mapper = new ObjectMapper();
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, emp);
		
//		System.out.println(sw.toString());
		
		System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(emp));
		
	}
}
