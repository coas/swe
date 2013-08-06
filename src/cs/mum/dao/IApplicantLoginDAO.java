package cs.mum.dao;

import java.util.List;

import cs.mum.model.UserLogin;

public interface IApplicantLoginDAO {
	public UserLogin getApplicationLoginById(long id);

	public List<UserLogin> getAllApplicantLogin();

	public void insert(UserLogin applicantLogin);
	
	public List<UserLogin> getApplicantLoginByUsernamePassword(String userName,String passWord);
	
	public List<UserLogin> getApplicantByEmailAddress(String username);
	
	public UserLogin getApplicantLoginByCdatePassword(String cdate, String pwd);
		
}
