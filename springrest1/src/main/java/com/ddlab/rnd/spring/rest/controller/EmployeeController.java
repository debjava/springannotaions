package com.ddlab.rnd.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ddlab.spring.rest.beans.Employee;
import com.ddlab.spring.rest.beans.StatusBean;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	private List<Employee> empList = new ArrayList<Employee>();

	@RequestMapping(value = "ID/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object getEmp( @PathVariable String id )
	{
		Object obj = null;
		Employee emp = new Employee(id);
		
		if( empList.contains(emp))
		{
			for( Employee emp1 : empList )
			{
				if( emp.equals(emp1))
				{
					obj = emp1;
					break;
				}
			}
		}
		else
		{
			StatusBean statusBean = new StatusBean();
			statusBean.setErrCode("002");
			statusBean.setErrMsg("Employee with this id "+id+" does not exist");
			obj = statusBean;
		}

		return obj;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public StatusBean create( @RequestBody Employee emp ) {
		StatusBean statusBean = new StatusBean();
		if( empList.contains(emp) )
		{
			statusBean.setErrCode("001");
			statusBean.setErrMsg("Employee with this id "+emp.getId()+" already exists");
		}
		else
		{
			empList.add(emp);
			statusBean.setStatus("Success");
		}
		
		display();
		return statusBean;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.PUT, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public StatusBean update( @RequestBody Employee emp ) {
		StatusBean statusBean = new StatusBean();
		
		if( empList.contains(emp))
		{
			for( Employee emp1 : empList )
			{
				if( emp.equals(emp1))
				{
					empList.remove(emp1);
					empList.add(emp);
					statusBean.setStatus("Success");
					break;
				}
			}
		}
		else
		{
			statusBean.setErrCode("002");
			statusBean.setErrMsg("Employee with this id "+emp.getId()+" does not exist");
		}
		
		return statusBean;
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.DELETE, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public StatusBean delete( @RequestBody Employee emp ) {
		StatusBean statusBean = new StatusBean();
		
		if( empList.contains(emp))
		{
			for( Employee emp1 : empList )
			{
				if( emp.equals(emp1))
				{
					empList.remove(emp1);
					statusBean.setStatus("Success");
					break;
				}
			}
		}
		else
		{
			statusBean.setErrCode("003");
			statusBean.setErrMsg("Employee with this id "+emp.getId()+" does not exist, hence data can not be deleted");
		}
		
		return statusBean;
	}

	public void display()
	{
		for( Employee emps : empList )
			System.out.println(emps);

		System.out.println("---------------------------------****************-----------------------------------");
	}

}
