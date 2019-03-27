package com.hcl.controller;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestBodyController {
	
	 @RequestMapping(value = "/requestBody", method = RequestMethod.POST)
	  public void writeRequestBody(@RequestBody String body, Writer writer) throws IOException {
	    //write the content in to the browser
	    writer.write(body);
	  }


}
