package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Contact;



@Controller
public class ContactController {
	
	/*@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public ModelAndView checkDetails() {
				
		return new ModelAndView("contact");
	}*/
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		
		return new ModelAndView("contactForm", "contact", new Contact());
	}


	
}
