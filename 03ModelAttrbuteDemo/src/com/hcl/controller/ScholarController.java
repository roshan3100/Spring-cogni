package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Scholar;

@Controller
public class ScholarController {
	
	@RequestMapping(value="/showScholarForm", method=RequestMethod.GET)
	public ModelAndView showScholarForm(){
		
		Scholar scholarObj = new Scholar();
		
		return new ModelAndView("scholarForm", "scholar", scholarObj);
		
		
	}
	
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public ModelAndView processScholarForm(@ModelAttribute Scholar scholarObj){
		
		
		return new ModelAndView("scholarResultPage", "scholar", scholarObj);
		
	}
	
	

}
