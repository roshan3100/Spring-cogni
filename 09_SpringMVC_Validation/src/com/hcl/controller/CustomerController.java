package com.hcl.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Customer;
import com.hcl.validator.CustomerValidator1;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerValidator1 customerValidator;
	
	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	

	@ModelAttribute("FrameWorkList")
	public List<String> populateWebFrameworkList(){
		
		List<String> wfList = new ArrayList<String>();
		wfList.add("Struts2");
		wfList.add("JSF");
		wfList.add("Spring MVC2");
		wfList.add("Apache wicket");
		return wfList;
		
	}
	
	@ModelAttribute("sportList")
	public List<String> populateFavouriteSportList(){
		
		List<String>sportList = new ArrayList<>();
		sportList.add("Criket");
		sportList.add("Football");
		sportList.add("Hockey");
		sportList.add("Tennis");
		return sportList;
		
	}
	
	@ModelAttribute("skillList")
	public Map<String, String>populateJavaSkillList(){
		
		Map<String, String>skillList= new LinkedHashMap<String, String>();
		skillList.put("Java", "Java");
		skillList.put("Servlet", "Servlet");
		skillList.put("Jsp", "Jsp");
		skillList.put("Jdbc", "Jdbc");
		return skillList;
		
	}
	
	@ModelAttribute("countryList")
	public Map<String, String>populateCountryList(){
		
		Map<String, String>countryList= new LinkedHashMap<String, String>();
		countryList.put("India", "India");
		countryList.put("USA", "USA");
		countryList.put("China", "China");
		countryList.put("Spain", "Spain");
		return countryList;
		
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public ModelAndView showCustomerForm(){
		
		Customer customer = new Customer();
		//set defaults
		customer.setSex("M");
		customer.setFavFrameworks(new String[]{"Struts2"});
		customer.setJavaSkills(new String[]{"Java"});
		customer.setSecretValue("I am secret Value");
		
		return new ModelAndView("customerPage", "customer",customer);
		
			
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class,"date_of_birth", new CustomDateEditor(format, true));
		
		binder.setValidator(customerValidator);
	}
	
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public String addCustomerDetails(@ModelAttribute @Valid Customer customer , BindingResult result, ModelMap model){
		
	model.addAttribute("customer", customer);
	
	if(result.hasErrors()){
		return "customerPage";
	}
	else{
		return "customerResultPage";
	}
			
	}
}
