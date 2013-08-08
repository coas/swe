package cs.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.mum.model.PersonalInformation;
import cs.mum.model.Section;
import cs.mum.services.ApplicationService;


@Controller
public class ApplicationController {
	private ApplicationService applicationService;
	
	@RequestMapping(value="/application")
	public String application(@ModelAttribute("personalApplication") PersonalInformation personalInformation,
			BindingResult result) {
		return "application";
	}
	
	@RequestMapping(value="/personalInformation")
	public String personalInformation(Model model) {
		return "application";
	}
	
	
}
