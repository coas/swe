package cs.mum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cs.mum.mb.Helper;
import cs.mum.model.User;
import cs.mum.model.UserLogin;
import cs.mum.services.UserLoginService;
import cs.mum.services.UserService;
import cs.mum.validation.UserLoginValidator;

@Controller
@SessionAttributes("email")
public class UserLoginController {
	@Autowired
	private UserLoginService userLoginService;
	@Autowired
	private UserService userService;
	@Autowired
	UserLoginValidator userLoginValidate;
	@Autowired
	private Helper helper;
	
	@RequestMapping(value = "/")
	public String login(@ModelAttribute("userlogin") UserLogin userLogin,BindingResult result) {
		return "login";
	}

	@RequestMapping(value = "/logginUser", method = RequestMethod.POST)
	public String login(@ModelAttribute("userlogin") UserLogin userLogin,BindingResult result,
			Model model,HttpServletRequest request) {
		userLoginValidate.validate(userLogin, result);
		if(result.hasErrors()) {
			return "login";
		}else{
			boolean flag = false;
			String displayPage = "";
	
			List<UserLogin> myList = userLoginService
					.getUserLoginByUsernamePwd(userLogin.getUserName(), userLogin.getPassword());
			model.addAttribute("login", flag);
			if (myList.size() > 0) {
				flag = true;
				model.addAttribute("email", userLogin.getUserName());
				displayPage = "Thanks";// we're supposed to return the menus
			} else {
				flag = false;
				displayPage = "login";// if the login failed
			}
	
			return displayPage;
		}

	}
	
	@RequestMapping(value="/doLogout")
	public String doLogout(SessionStatus sessionStatus) {
		//controll the session
		sessionStatus.setComplete();
		return "redirect:/";
	}
	
	@RequestMapping(value="/recoverMyAccount")
	public String recoverMyAccount(@ModelAttribute("recoverAccount") UserLogin userLogin,
			BindingResult result) {
		return "recoverMyAccount";
	}
	@RequestMapping(value="/recoverMyAccount", method=RequestMethod.POST)
	public String recoverMyaccount(@ModelAttribute("recoverAccount") UserLogin userLogin,
			BindingResult result) {
		userLoginValidate.validateRecoverAccount(userLogin, result);
		if(result.hasErrors()) {
			return "recoverMyAccount";
		}else{
			String pwd = Helper.randomAlphaNumeric(9);
			List<UserLogin> login =userLoginService.
					getUserByEmailAddress(userLogin.getUserName());
			UserLogin pLogin = login.get(0);
			pLogin.setPassword(Helper.md5(pwd));
			userLoginService.updateUserLogin(pLogin);
			String mailBody = "Dear "+userLogin.getUserName();
				   mailBody+= "\n\n You have requested for Account Recovery service,";
				   mailBody+= ", \n\n Use the following password to Login into your Account: ";
				   mailBody+= pwd;
				   mailBody+= " If you are not aware with this request Please, ";
				   mailBody+= "\n ckick the Link below to Lock your account";
				   mailBody+= "\n\n";
				   mailBody+= " http://localhost:8080/coas/";
				   mailBody+= "suspiciousLock/";
				   mailBody+= Helper.md5(String.valueOf(pLogin.getUser().getCreationDate()));
				   mailBody+= "/"+Helper.md5(pwd)+"/";
				   mailBody += "\n\n****************************************************************";
				   mailBody+= "\n\n Thanks\n\n http://www.mum.edu";
			helper.sendMail(userLogin.getUserName(), mailBody, "Account Recovery");
			return "redirect:/";
		}
	}
	@RequestMapping(value="/changePassword")
	public String changePassword(@ModelAttribute("changePassword") UserLogin userLogin,
			BindingResult result) {
		return "changePassword";
	}
	
	@RequestMapping(value="/changePassword", method=RequestMethod.POST)
	public String changePassword(@ModelAttribute("changePassword") UserLogin userLogin, 
			BindingResult result,@ModelAttribute("email") String email) {
		userLoginValidate.validateChangePassword(userLogin, result, email);
		if(result.hasErrors()) {
			return "changePassword";
		}else{
			List<UserLogin> list = userLoginService.getUserByEmailAddress(email);
			UserLogin login = list.get(0);
			login.setPassword(Helper.md5(userLogin.getNewPassword()));
			userLoginService.updateUserLogin(login);
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/suspiciousLock/{option}/{pwd}/")
	//option variable is the MD5() for creation date
	public String suspiciousLock(@PathVariable String option, @PathVariable String pwd) {
		UserLogin userLogin = userLoginService.getUserLoginByCdatePassword(option, pwd);
		User user = userLogin.getUser();
		user.setStatus(false);
		userService.updateUser(user);
		return "redirect:/";
	}
}
