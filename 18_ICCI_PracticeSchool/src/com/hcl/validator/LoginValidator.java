package com.hcl.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.model.LoginTo;
@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginTo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
	
		LoginTo customer = (LoginTo) object;
		 
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName", "Field user name is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password", "Field password is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "required.confirmPassword", "Field confirm password is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "required.role", "Field role is required");
		
		 
		
		 
		 if(!(customer.getPassword().equals(customer.getConfirmPassword()))){
			 errors.rejectValue("password", "notmatch.password", "Field password and Confirm password  should be same");
		 }
		
	}

}
