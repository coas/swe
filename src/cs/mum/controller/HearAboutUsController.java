package cs.mum.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.mum.model.HearAboutUs;
import cs.mum.model.User;
import cs.mum.services.HearAboutUsService;
import cs.mum.services.UserService;

@Controller
public class HearAboutUsController {
	@Autowired
	private HearAboutUsService hearAboutUsService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/hearAboutUs")
	public String hearAboutUs() {
		User user = userService.getuserById(1);
		HearAboutUs h0 = new HearAboutUs("Not on List", true, new Date(), user);
		HearAboutUs h1 = new HearAboutUs("MUM Student", true, new Date(), user);
		HearAboutUs h2 = new HearAboutUs("MUM Allumni", true, new Date(), user);
		HearAboutUs h3 = new HearAboutUs("MUM Agent", true, new Date(), user);
		HearAboutUs h4 = new HearAboutUs("naukri.com", true, new Date(), user);
		hearAboutUsService.insert(h0);
		hearAboutUsService.insert(h1);
		hearAboutUsService.insert(h2);
		hearAboutUsService.insert(h3);
		hearAboutUsService.insert(h4);
		return "hearAboutUs";
	}
}
