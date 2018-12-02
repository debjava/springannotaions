package com.ddlab.test;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.ddlab.spring.rest.beans.Account;
import com.ddlab.spring.rest.beans.Address;
import com.ddlab.spring.rest.beans.Employee;

public class Test2 {

	public static String convertToXml(Object source, Class... type) {
        String result;
        StringWriter sw = new StringWriter();
        try {
            JAXBContext carContext = JAXBContext.newInstance(type);
            Marshaller carMarshaller = carContext.createMarshaller();
            carMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            carMarshaller.marshal(source, sw);
            result = sw.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
	
	public static void main(String[] args) {
		
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
		
		String xmlVal = convertToXml(emp, Employee.class);
		System.out.println(xmlVal);

	}

}
