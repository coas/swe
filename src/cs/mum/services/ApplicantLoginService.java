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
public class ApplicantLoginService {
	@Autowired
	private IUserLoginDAO applicantLoginDAO;
	private static final String regMailSubj = "Compro on-Line Application Verification";
	
	private Helper help = new Helper();

	public void setApplicantLoginDAO(IUserLoginDAO applicantLoginDAO) {
		this.applicantLoginDAO = applicantLoginDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<UserLogin> getApplicants() {
		return applicantLoginDAO.getAllApplicantLogin();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserLogin getApplicantById(long id) {
		return applicantLoginDAO.getApplicationLoginById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertApplicantLogin(UserLogin applicant) {
		applicant.setPassword(Helper.md5(applicant.getPassword()));
		applicantLoginDAO.insert(applicant);
		String regmailBody  = "Dear "+ applicant.getApplicant().getFirstName()+ ",\n\n\n";
			   regmailBody += "Please click the Link to verify your email address and activate your Account!";
			   regmailBody += " http://localhost:8080/coas/";
			   regmailBody += "regVerification/"+applicant.getApplicant().getRegVerification();
			   regmailBody += "\n\n****************************************************************";
			   regmailBody += "\n\n Thanks for registering at http://www.mum.edu";
		help.sendMail(applicant.getUserName(), regmailBody, regMailSubj);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateUserLogin(UserLogin login) {
		applicantLoginDAO.insert(login);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UserLogin> getApplicantLoginByUsernamePwd(String userName,String passWord) {
		return applicantLoginDAO.getApplicantLoginByUsernamePassword(userName, passWord);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UserLogin> getApplicantByEmailAddress(String username) {
		return applicantLoginDAO.getApplicantByEmailAddress(username);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UserLogin getApplicantLoginByCdatePassword(String option,String pwd) {
		return applicantLoginDAO.getApplicantLoginByCdatePassword(option, pwd);
	}
	
}
