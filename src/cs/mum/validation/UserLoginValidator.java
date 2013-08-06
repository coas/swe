package cs.mum.validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cs.mum.model.UserLogin;
import cs.mum.services.UserLoginService;

@Service
public class UserLoginValidator implements Validator {
	@Autowired
	private UserLoginService userLoginService;

	public void setUserLoginService(
			UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return UserLogin.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserLogin userLogin = (UserLogin) target;
		List<UserLogin> list = userLoginService
				.getUserLoginByUsernamePwd(userLogin.getUserName(),
						userLogin.getPassword());
		if (userLogin.getUserName() == ""
				|| userLogin.getPassword() == "" || list.size() != 1) {
			errors.reject("password", "Wrong User name or Password!");
			return;
		}
	}

	public void validateRecoverAccount(Object target, Errors errors) {
		UserLogin userLogin = (UserLogin)target;
		List<UserLogin> list = userLoginService.
				getUserByEmailAddress(userLogin.getUserName());
		if(userLogin.getUserName() == "" || list.size() != 1) {
			if(userLogin.getUserName() == "") {
				errors.reject("userName", "Email Address can not be blank!");
				return;
			}
			
			if(list.size() != 1) {
				errors.reject("userName", "Problem with Email Address!");
				return;
			}
		}
	}
	
	public void validateChangePassword(Object target, Errors errors, String email) {
		UserLogin userLogin = (UserLogin)target;
		List<UserLogin> list = userLoginService.
				getUserByEmailAddress(email);
		if(userLogin.getPassword() == "" || userLogin.getConfirmPassword() == "" || 
				userLogin.getNewPassword() == "") {
			if(userLogin.getPassword() == "") {
				errors.reject("password", "Password can not be blank!");
			}
			
			if(userLogin.getConfirmPassword() == "") {
				errors.reject("confirmPassword", "Re-type Password can not be blank!");
			}
			
			if(userLogin.getNewPassword() == "") {
				errors.reject("newPassword", "New Password can not be blank!");
			}
			
			if(!userLogin.getPassword().equals(list.get(0).getPassword())) {
				errors.reject("password", "Old password is not correct!");
			}
			
			if(!userLogin.getConfirmPassword().equals(userLogin.getNewPassword())) {
				errors.reject("newPassword", "New password and Re-type password does not match!");
			}
			return;
		}
	}

}
