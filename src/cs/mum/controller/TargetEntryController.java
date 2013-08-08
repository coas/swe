package cs.mum.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.mum.model.TargetEntry;
import cs.mum.model.User;
import cs.mum.services.TargetEntryService;
import cs.mum.services.UserService;

@Controller
public class TargetEntryController {
	@Autowired
	private TargetEntryService targetEntryService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/targetEntry")
	public String targetEntry() {
		User user = userService.getuserById(1);
		TargetEntry t0 = new TargetEntry("October 2013", true, new Date(), user);
		TargetEntry t1 = new TargetEntry("February 2014", true, new Date(), user);
		TargetEntry t2 = new TargetEntry("June 2014", true, new Date(), user);
		TargetEntry t3 = new TargetEntry("October 2014", true, new Date(), user);
		targetEntryService.insert(t0);
		targetEntryService.insert(t1);
		targetEntryService.insert(t2);
		targetEntryService.insert(t3);
		return "targetEntry";
	}
}
