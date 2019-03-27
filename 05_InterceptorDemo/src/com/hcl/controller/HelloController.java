package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String show(ModelMap model){
		
		String data ="Hello world Spring MVC";
		
		model.addAttribute("message", data);
		System.out.println(data);
		return "hello";
		
	}

}
