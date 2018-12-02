package com.ddlab.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/abc")
public class JsonService {

  private static Map<String, Person> data = new HashMap<String, Person>();
  static{
    data.put("ADAM", new Person("Adam", "Davies", 42));
    data.put("JANE", new Person("Jane", "Harrison", 35));
  }

  @RequestMapping(value="{name}", method = RequestMethod.GET)
  public @ResponseBody Person getPerson(@PathVariable String name){
    Person p = data.get(name.toUpperCase());
    return p;
  }
  
  @RequestMapping(value="/p", method = RequestMethod.POST)
  public @ResponseBody Person setPerson(@PathVariable Person p){
//    Person p = data.get(name.toUpperCase());
    return p;
  }
  
  
}
