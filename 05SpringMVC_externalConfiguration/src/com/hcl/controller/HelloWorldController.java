package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping(value="/myhello",method=RequestMethod.GET)
	public ModelAndView helloWorld(){
		
		String modelObj = "Welcome to Spring MVC !";
		
		return new ModelAndView("success", "message", modelObj);
		
		
		
	}
	
	
	

}
