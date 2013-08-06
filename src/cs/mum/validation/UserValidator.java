package cs.mum.validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cs.mum.model.User;
import cs.mum.model.UserLogin;
import cs.mum.services.UserLoginService;
@Service
public class UserValidator implements Validator {
	@Autowired
	private UserLoginService userLoginService;

	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User)target;
		List<UserLogin> list = userLoginService.
				getUserByEmailAddress(user.getEmailAddress());
		
		if(user.getFirstName() == "" || user.getLastName() == "" 
				|| user.getEmailAddress() == "" || user.getLogin().getPassword() == ""
				|| !(user.getLogin().getPassword().equals(user.getLogin().getConfirmPassword())) 
				|| list.size()>0) {
			
			if(user.getFirstName() == "") {
				errors.reject("firstName", "First name can not be blank!");
			}
			
			if(user.getLastName() == "") {
				errors.reject("lastName", "Last name can not be blank!");
			}
			
			if(user.getEmailAddress() == "") {
				errors.reject("emailAddress", "Email address can not be blank!");
			}
			
			if(user.getLogin().getPassword() == "") {
				errors.reject("login.password", "Password can not be blank!");
			}
			
			if(!(user.getLogin().getPassword().equals(user.getLogin().getConfirmPassword()))) {
				errors.reject("login.confirmPassword","Password do not match!");
			}
			
			if(list.size()>0) {
				errors.reject("userName","You have an account with us, If you forget your password," +
						"request a new password");
			}
			
			return;
		}
		
		
	}
	
}
