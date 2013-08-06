package cs.mum.dao;

import java.util.List;

import cs.mum.model.User;

public interface IUserDAO {
	public User getApplicationById(long id);

	public List<User> getAllApplicant();

	public void insert(User applicant);
	
	public User getApplicantById(long id);
	
	public User getApplicantByRegVerify(String regVerify);
	
}
