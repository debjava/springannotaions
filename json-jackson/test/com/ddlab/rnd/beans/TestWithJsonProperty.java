package com.ddlab.rnd.beans;

import org.codehaus.jackson.map.ObjectMapper;

import com.ddlab.rnd.beans.Address;
import com.ddlab.rnd.beans.Person;

/**
 * The Class TestWithJsonProperty is used as test class to generate the json
 * contents using json annotations .
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestWithJsonProperty {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		Address adrs = new Address();
		adrs.setCountry("India");
		adrs.setHouseNo("A-21");
		adrs.setPin("123456");
		adrs.setStreetName("Queens Land");

		Person person = new Person();
		person.setAdrs(adrs);
		person.setId("123");
		person.setName("Debadatta Mishra");

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.defaultPrettyPrintingWriter()
				.writeValueAsString(person));
	}

}
