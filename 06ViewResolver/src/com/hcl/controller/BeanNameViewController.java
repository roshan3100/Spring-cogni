package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Uttam
 */

@Controller
public class BeanNameViewController {

 @RequestMapping("/view1")
 public String beanNameView(){
	 System.out.println("inside beanname");
     return "beanname";
 }
}
