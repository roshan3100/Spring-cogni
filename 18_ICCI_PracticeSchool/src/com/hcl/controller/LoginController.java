package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.LoginTo;
import com.hcl.service.LoginService;
import com.hcl.validator.LoginValidator;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	LoginValidator loginValidator;
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {

		LoginTo loginToObj = new LoginTo();
		return new ModelAndView("registerPage", "loginTo", loginToObj);

	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		
		binder.setValidator(loginValidator);
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String addScholar(@ModelAttribute @Valid LoginTo loginTo, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "registerPage";
		} else {

			int id =loginService.addUser(loginTo);
			model.addAttribute("loginId", id);
			
		}
		return "homePage";

	}

}
