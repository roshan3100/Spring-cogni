package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Scholar;
import com.hcl.service.ScholarService;

@Controller
public class ScholarController {

	@Autowired
	private ScholarService scholarService;

	public ScholarService getScholarService() {
		return scholarService;
	}

	public void setScholarService(ScholarService scholarService) {
		this.scholarService = scholarService;
	}

	@ModelAttribute("countryList")
	public List populateCountryList() {

		return scholarService.getCountryList();
	}

	@ModelAttribute("sportsList")
	public List populateSportList() {

		return scholarService.getSportsList();
	}

	@RequestMapping(value = "/showScholarForm", method = RequestMethod.GET)
	public ModelAndView showScholarForm() {

		Scholar scholarObj = new Scholar();

		return new ModelAndView("scholarForm", "scholar", scholarObj);

	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public ModelAndView processScholarForm(@ModelAttribute Scholar scholarObj) {

		return new ModelAndView("scholarResultPage", "scholar", scholarObj);
	}

}
