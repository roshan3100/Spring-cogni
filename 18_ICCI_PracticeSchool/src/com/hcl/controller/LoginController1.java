package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.exceptions.InvalidUserException;
import com.hcl.model.LoginTo;
import com.hcl.service.LoginService;
import com.hcl.validator.LoginValidator1;

@Controller
public class LoginController1 {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	LoginValidator1 loginValidator1;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {

		LoginTo loginToObj = new LoginTo();
		return new ModelAndView("loginPage", "loginTo", loginToObj);

	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		
		binder.setValidator(loginValidator1);
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String addScholar(@ModelAttribute @Valid LoginTo loginTo, BindingResult result, ModelMap model) throws InvalidUserException {

		if (result.hasErrors()) {
			return "loginPage";
		} 
		
		else {

			LoginTo lgnTo =loginService.getUserById(loginTo.getUserId());
			
			/*System.out.println("Form username: "+loginTo.getUserName());
			System.out.println("Form password: "+loginTo.getPassword());
			System.out.println("Database  username: "+lgnTo.getUserName());
			System.out.println("database  password: "+lgnTo.getPassword());*/
			
			if(lgnTo==null){
				
				throw new InvalidUserException("UserId not available");
			}
			
			/*else if(!((loginTo.getUserName().equals(lgnTo.getUserName())) && (loginTo.getPassword().equals(lgnTo.getPassword())))){
				throw new InvalidUserException("UserId not available");
			}*/
			else{
				return "homePage";
			}
			
		}
	
		

	}
	
	  @ExceptionHandler(InvalidUserException.class)
		public ModelAndView handlerMethod(InvalidUserException exception){
			  System.out.println("Exception class");
			  System.out.println(exception.getMessage() );
			return new ModelAndView("error","exception",exception);
		}

}
