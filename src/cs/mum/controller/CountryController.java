package cs.mum.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.mum.model.Country;
import cs.mum.model.User;
import cs.mum.services.CountryService;
import cs.mum.services.UserService;

@Controller
public class CountryController {
	@Autowired
	private UserService userService;
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value="/country")
	public String country() {
		User user = userService.getuserById(1);
		Country c0 = new Country("Not on List", new Date(), "Y", user);
		Country c1 = new Country("Tanzania", new Date(), "Y", user);
		Country c2 = new Country("Rwanda", new Date(), "Y", user);
		Country c3 = new Country("Nigeria", new Date(), "Y", user);
		Country c4 = new Country("Ethiopia", new Date(), "Y", user);
		Country c5 = new Country("USA", new Date(), "Y", user);
		countryService.insert(c0);
		countryService.insert(c1);
		countryService.insert(c2);
		countryService.insert(c3);
		countryService.insert(c4);
		countryService.insert(c5);
		return "country";
	}
}
