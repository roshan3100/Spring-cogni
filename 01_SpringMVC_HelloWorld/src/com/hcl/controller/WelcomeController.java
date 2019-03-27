package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping(value="welcome",method=RequestMethod.GET)
	public ModelAndView welcome(){
		
		String data="Welcome to Spring MVC";
		
		return new ModelAndView("welcome","message",data);
		
	}

}
