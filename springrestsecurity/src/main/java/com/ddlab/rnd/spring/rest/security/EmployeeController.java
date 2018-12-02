package com.ddlab.rnd.spring.rest.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
public class EmployeeController {


	@RequestMapping(value = "ID/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object getEmp( @PathVariable String id )
	{
		return "You have entered the ID : "+id;
	}
}
