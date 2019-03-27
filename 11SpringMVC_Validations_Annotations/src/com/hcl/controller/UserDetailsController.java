package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.model.UserDetails;
import com.hcl.validator.PasswordMissMatchValidator;



@Controller
public class UserDetailsController {
	
	@Autowired
	private PasswordMissMatchValidator validator;

	@RequestMapping(value="/displayForm", method=RequestMethod.GET)
    public String helloWorld(ModelMap model) {
		
		UserDetails ud = new UserDetails();
		model.addAttribute("userDetails", ud);
        return "userPage";            
    }
	
	/*@InitBinder
	  protected void initBinder(WebDataBinder binder) {

	    binder.setValidator(validator);
	  }*/
	
	@RequestMapping("/login")
    public String loginCheck(@Valid UserDetails userDetails, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "userPage";
        } else {
            model.addAttribute("user", userDetails);
            return "success";
        }
    }
	
	
}
