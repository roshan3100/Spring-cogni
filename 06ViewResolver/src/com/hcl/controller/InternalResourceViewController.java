package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InternalResourceViewController {
	
	@RequestMapping("/view4")
	public ModelAndView handleRequestInternal() {

		ModelAndView model = new ModelAndView("welcome");
		
		return model;
	}

}
