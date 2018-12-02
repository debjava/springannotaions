package com.ddlab.rnd.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * The Class TestXmlGenerator is used as a test class to generate the XML from Java Object.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestXmlGenerator 
{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception
	{
		Desc desc = new Desc();
		desc.setType("IT");
		desc.setUnit("Banking");
		desc.setValue("A virtual company");

		Org org = new Org();
		org.setId("Id-001");
		org.setName("DDLAB Inc");

		org.setDesc(desc);
		Employees emps = new Employees();
		List<Emp> empList = new ArrayList<Emp>();
		for( int i = 0 ; i < 2 ; i++ )
		{
			Emp emp = new Emp();
			emp.setId("E-"+i);
			emp.setName("Ename-"+i);
			List<Address> adrsList = new ArrayList<Address>();
			Address adrs = new Address();
			adrs.setRoadNo("R-"+i);
			adrs.setStreetNo("St-"+i);
			adrs.setType("P");
			adrsList.add(adrs);
			emp.setAdrs(adrsList);
			empList.add(emp);
		}

		emps.setEmp(empList);
		org.setEmps(emps);

		JAXBContext jctx = JAXBContext.newInstance(Org.class);
		Marshaller marshaller = jctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(org, System.out);
	}

}
