package com.ddlab.rnd.beans;

import org.codehaus.jackson.map.ObjectMapper;

import com.ddlab.rnd.beans.Account;
import com.ddlab.rnd.beans.Customer;

/**
 * The Class TestJsonWithPojo is used as test class to generate the json contents by default.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestJsonWithPojo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		Account act = new Account();
		act.setActNo("1234");
		act.setActType("Savings");
		
		Customer customer = new Customer();
		customer.setId("111");
		customer.setName("Deba");
		customer.setAct(act);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.defaultPrettyPrintingWriter().writeValueAsString(customer));

	}

}
