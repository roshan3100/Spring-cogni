package com.hcl.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Uttam
 */
@Controller
public class ResourceBundleViewController {
@SuppressWarnings("static-access")
@RequestMapping("/view3")
 public String resourcebundleView(Locale locale){
     locale.setDefault(new Locale("en"));
     return "resourcebundle";
 }
}
