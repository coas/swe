package cs.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.mum.model.Country;
import cs.mum.model.FinalSection;
import cs.mum.model.PersonalInformation;
import cs.mum.model.TargetEntry;
import cs.mum.services.CountryService;
import cs.mum.services.TargetEntryService;


@Controller
public class ApplicationController {
	@Autowired
	private CountryService countryService;
	@Autowired
	private TargetEntryService targetEntryService;
	
	@RequestMapping(value="/application")
	public String application(@ModelAttribute("personalApplication") PersonalInformation personalInformation,
			BindingResult resultPersonalInfo,
			@ModelAttribute("finalSection") FinalSection finalSection, BindingResult resultFinalSection
			,Model model) {
		List<Country> Listcountries = countryService.listOfCountries();
		List<TargetEntry> listTargetEntry = targetEntryService.getListOfTargetEntries();
		model.addAttribute("countries", Listcountries);
		model.addAttribute("targetEntries", listTargetEntry);
		return "application";
	}
	
	@RequestMapping(value="/personalInformation")
	public String personalInformation(Model model) {
		return "application";
	}
	
}
