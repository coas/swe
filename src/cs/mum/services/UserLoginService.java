package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IUserLoginDAO;
import cs.mum.mb.Helper;
import cs.mum.model.UserLogin;
@Service
public class UserLoginService {
	@Autowired
	private IUserLoginDAO userLoginDAO;
	private static final String regMailSubj = "Compro on-Line Application Verification";
	@Autowired
	private Helper help;

	public void setHelp(Helper help) {
		this.help = help;
	}

	public void setUserLoginDAO(IUserLoginDAO userLoginDAO) {
		this.userLoginDAO = userLoginDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<UserLogin> getUsers() {
		return userLoginDAO.getAllUserLogin();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserLogin getUserById(long id) {
		return userLoginDAO.getUserLoginById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertUserLogin(UserLogin user, String baseUrl,
			String bodyMail, String subjectMail) {
		user.setPassword(Helper.md5(user.getPassword()));
		userLoginDAO.insert(user);
		String regmailBody = "Dear " + user.getUser().getFirstName()
				+ ",\n";
		regmailBody += bodyMail;
		regmailBody += baseUrl + "regVerification/"
				+ user.getUser().getRegVerification();

		help.sendMail(user.getUserName(), regmailBody, subjectMail);

	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateUserLogin(UserLogin login) {
		userLoginDAO.insert(login);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UserLogin> getUserLoginByUsernamePwd(String userName,String passWord) {
		return userLoginDAO.getUserLoginByUsernamePassword(userName, passWord);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UserLogin> getUserByEmailAddress(String username) {
		return userLoginDAO.getUserByEmailAddress(username);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserLogin getUserLoginByCdatePassword(String option,String pwd) {
		return userLoginDAO.getUserLoginByCdatePassword(option, pwd);
	}
	
}
