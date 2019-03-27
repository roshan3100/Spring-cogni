package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public ModelAndView hello(){
		
		String message ="Hello world Spring MVC";
		System.out.println(message);
		return new ModelAndView("hello","message",message);
		
	}
	@RequestMapping(value="/book/{item}")
	public ModelAndView show(@PathVariable("item") int item){
		String data= "The item value is "+item;
		
		return new ModelAndView("hello","message",data);
		
		
	}
	@RequestMapping(value="/phello",params="uname")
	public ModelAndView showParam(@RequestParam("uname")String name){
		String data ="The param value is "+name;
		return new ModelAndView("hello","message",data);
		
	}
	
	@RequestMapping("mhello")
	public String display(ModelMap model){
		
		String data="I am a model Data !";
		System.out.println("I am model data");
		model.addAttribute("message", data);
		return "hello";
		
	}

}
