package com.hcl.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.model.Customer;

public class CustomerValidator1 implements Validator {
	
	public CustomerValidator1() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * supports(Class) – Can this Validator validate instances of the supplied
	 * Class?
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return Customer.class.isAssignableFrom(clazz);
	}

	/*
	 * validate(Object, org.springframework.validation.Errors) – validates the
	 * given object and in case of validation errors, registers those with the
	 * given Errors object
	 */
	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName", "Field Customer Name is required");
		ValidationUtils.rejectIfEmpty(errors, "password","required.password" , "Field Password is required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword","required.confirmPassword" , "Field Confirm Password is required");
		ValidationUtils.rejectIfEmpty(errors, "address","required.address" , "Field Address is required");
		ValidationUtils.rejectIfEmpty(errors, "sex","required.sex" , "Field Sex is required");
		ValidationUtils.rejectIfEmpty(errors, "favSport","required.favSport" , "Field Favourite Sport is required");
		ValidationUtils.rejectIfEmpty(errors, "javaSkills","required.javaSkills" , "Field Java Skill is required");
		
		Customer customer =(Customer) object;
		if(!(customer.getPassword().equals(customer.getConfirmPassword()))){
						errors.rejectValue("password", "notmatch.password");
		}
		
		if(customer.getFavFrameworks().length==0){
			errors.rejectValue("favFrameworks", "required.favFrameworks","Field favourite frameworks is required");
		}
		
		if(customer.getJavaSkills().length==0){
			errors.rejectValue("javaSkills", "required.javaSkills","Field javaSkills is required");
		}
		
		if ("NONE".equals(customer.getCountry())) {
			errors.rejectValue("country", "required.country","Field country is required");
		}
		
	}

}
