package com.hcl.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.exceptions.InvalidUserException;
import com.hcl.model.LoginTo;
import com.hcl.service.LoginService;
import com.hcl.service.LoginServiceImpl;
@Component
public class LoginValidator1 implements Validator {
	
	@Autowired
	 LoginService service;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginTo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
	
		 LoginTo loginTo = (LoginTo)object;
		
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required.userId", "Field user Id is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName", "Field user name is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password", "Field password is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "enterCode", "required.enterCode", "Field enterCode is required");
		// LoginService service = new LoginServiceImpl();
		 LoginTo lgnTo =null;
		 if(!(loginTo.getUserName().equals("") && loginTo.getPassword().equals(""))){
		 lgnTo = service.getUserById(loginTo.getUserId()); 
		
		 
		 if(!(loginTo.getUserName().equals(lgnTo.getUserName()))){
			 errors.rejectValue("userName", "mismatch.userName", "Field userName is not correct");
			}	
		 
		 if(!(loginTo.getPassword().equals(lgnTo.getPassword()))){
			 errors.rejectValue("password", "mismatch.password", "Field password is not correct");
		 }
		 }
		 
		 String password= loginTo.getPassword();
		 AlphaNumericValidator validator = new AlphaNumericValidator();
		 
		 if(!(validator.validateString(password))){
			 errors.rejectValue("password", "alphanumeric.password", "Field password should be alphaNumeric");
		 }
		 
		 if(!(loginTo.getRandomCode().equals(loginTo.getEnterCode()))){
			 errors.rejectValue("enterCode", "mismatch.enterCode", "Field enterCode is not correct");
		 }
		
	}

}
