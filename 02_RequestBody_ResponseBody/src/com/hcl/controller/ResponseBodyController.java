package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {
	
	@RequestMapping(value = "/something", method = RequestMethod.PUT)
	@ResponseBody
	public String helloWorld() {
	return "Hello World";
	}


}
