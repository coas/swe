package cs.mum.dao;

import java.util.List;

import cs.mum.model.UserLogin;

public interface IUserLoginDAO {
	public UserLogin getUserLoginById(long id);

	public List<UserLogin> getAllUserLogin();

	public void insert(UserLogin userLogin);
	
	public List<UserLogin> getUserLoginByUsernamePassword(String userName,String passWord);
	
	public List<UserLogin> getUserByEmailAddress(String username);
	
	public UserLogin getUserLoginByCdatePassword(String cdate, String pwd);
		
}
