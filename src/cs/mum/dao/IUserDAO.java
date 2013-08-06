package cs.mum.dao;

import java.util.List;

import cs.mum.model.User;

public interface IUserDAO {
	public List<User> getAllUser();

	public void insert(User user);
	
	public User getUserById(long id);
	
	public User getUserByRegVerify(String regVerify);
	
}
