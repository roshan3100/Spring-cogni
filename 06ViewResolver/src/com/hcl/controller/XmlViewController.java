package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Uttam
 */

@Controller
public class XmlViewController {
@RequestMapping("/view2")
 public String xmlviewbeanView(){
     return "xmlviewbean";
 }
}
