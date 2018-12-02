package com.ddlab.rnd.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * The Class TestXmlDataRetriever is used to read the xml and convert back to object.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestXmlDataRetriever 
{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception
	{
		JAXBContext jctx = JAXBContext.newInstance(Org.class);
		Unmarshaller unmarshaller = jctx.createUnmarshaller();
		Org org = (Org)unmarshaller.unmarshal( new File("data/org.xml"));
		System.out.println("Org Id - "+org.getId());
	}

}
