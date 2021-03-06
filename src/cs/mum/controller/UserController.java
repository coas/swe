package cs.mum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import cs.mum.model.User;
import cs.mum.model.UserLogin;
import cs.mum.services.UserLoginService;
import cs.mum.services.UserService;
import cs.mum.validation.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginService userLoginService;
	@Autowired
	UserValidator userValidator;

	@Value("${server.baseurl}")
	private String baseUrlPath;

	@Value("${server.subject}")
	private String subjectMail;

	@Value("${server.mailbody}")
	private String bodyMail;

	@RequestMapping(value = "/register.html")
	public String registerUser(Model model) {
		User user = new User();
		model.addAttribute("userBean", user);
		return "register";
	}

	@RequestMapping(value = "register.html", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("userBean") User userBean,
			BindingResult result, HttpServletRequest req,
			@RequestParam("recaptcha_challenge_field") String challenge,
			@RequestParam("recaptcha_response_field") String response,
			RedirectAttributes redirect, HttpSession session) {
		userValidator.validate(userBean, result);
		// Validate the reCAPTCHA
		String remoteAddr = req.getRemoteAddr();
		ReCaptchaImpl reCaptcha = new ReCaptchaImpl();

		// Probably don't want to hardcode your private key here but
		// just to get it working is OK...
		reCaptcha.setPrivateKey("6Ld9WeUSAAAAABHtcI_tBaS8DICZPS12J-dmK6CG ");

		ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr,
				challenge, response);

		if (!reCaptchaResponse.isValid()) {
			FieldError fieldError = new FieldError("userBean", "captcha",
					response, false, new String[] { "errors.badCaptcha" },
					null, "Please try again.");
			result.addError(fieldError);
		}

		if (result.hasErrors()) {
			return "register";
		} else {
			
			
			userService.insertUser(userBean);

			String userType = (String) session.getAttribute("userType");

			String returnType = "";

			System.out.println("the user role is [" + userType + "]");
			UserLogin login;

			if (userType == null) {

				login = new UserLogin(userBean.getEmailAddress(), userBean
						.getLogin().getPassword(), userBean.getLogin()
						.getPassword(), "Applicant", userBean);
				session.removeAttribute("userTypeReg");
				returnType = "redirect:/";
			} else {
				login = new UserLogin(userBean.getEmailAddress(), userBean
						.getLogin().getPassword(), userBean.getLogin()
						.getPassword(), "Admission", userBean);

				returnType = "Thanks";
			}
			/**
			 * Check if this user with this email already exists
			 */
			
			
			userLoginService.insertUserLogin(login, baseUrlPath, bodyMail,
					subjectMail);
			return returnType;
		}
	}

	@RequestMapping(value = "/regVerification/{regverify}")
	public String regmailVerification(@PathVariable String regverify) {
		User user = userService.getUserByRegVerify(regverify);
		user.setStatus(true);
		user.setRegVerification("Y");
		userService.updateUser(user);
		return "redirect:/";
	}

}
