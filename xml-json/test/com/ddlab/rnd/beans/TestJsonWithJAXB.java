package com.ddlab.rnd.beans;

import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

import com.ddlab.rnd.beans.Employee;
import com.ddlab.rnd.beans.Project;
import com.ddlab.rnd.util.FileUtil;

/**
 * The Class TestJsonWithJAXB is used as test class to generate the json
 * contents from the java class with JAXB annotations.
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestJsonWithJAXB {

	/**
	 * From Employee To json contents .
	 * 
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	@SuppressWarnings("deprecation")
	public static String toJSON() throws Exception {
		String jsonStr = null;
		Project project = new Project();
		project.setId("PID-101TMP");
		project.setName("Tornado");

		Employee emp = new Employee();
		emp.setId("Id1");
		emp.setName("Name-1");
		emp.setProj(project);

		ObjectMapper mapper = new ObjectMapper();
		AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
		// make deserializer use JAXB annotations (only)
		mapper.getDeserializationConfig().setAnnotationIntrospector(
				introspector);
		// make serializer use JAXB annotations (only)
		mapper.getSerializationConfig().setAnnotationIntrospector(introspector);
		jsonStr = mapper.defaultPrettyPrintingWriter().writeValueAsString(emp);
		System.out.println(mapper.defaultPrettyPrintingWriter()
				.writeValueAsString(emp));
		return jsonStr;
	}

	/**
	 * From json to Employee object.
	 * 
	 * @param jsonStr
	 *            the json str
	 * @return the employee
	 * @throws Exception
	 *             the exception
	 */
	@SuppressWarnings("deprecation")
	public static Employee fromJSON(String jsonStr) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
		mapper.getDeserializationConfig().setAnnotationIntrospector(
				introspector);
		mapper.getSerializationConfig().setAnnotationIntrospector(introspector);
		Employee emp = mapper.readValue(jsonStr, Employee.class);
		return emp;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {
		String filePath = "data/employee.json";
		String jsonStr = FileUtil.readFileAsString(filePath);
		Employee emp = fromJSON(jsonStr);
		System.out.println(emp.getId() + "----" + emp.getName());
	}

}
