package com.hcl.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.hcl.model.UserDetails;
@Component
public class PasswordMissMatchValidator implements Validator  {

	@Override
	public boolean supports(Class<?> myclass) {
		return UserDetails.class.equals(myclass);

	}

	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("In validator");
		UserDetails user = (UserDetails)obj;
		if (!(user.getPassword()).equals(user
		        .getConfirmPassword())) {
			 errors.rejectValue("password", "notmatch.password", "Field password and Confirm password  should be same");
		    }

		
	}

}
