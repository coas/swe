package cs.mum.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IUserDAO;
import cs.mum.mb.Helper;
import cs.mum.model.User;
@Service
public class UserService {
	@Autowired
	private IUserDAO userDao;

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<User> getUsers() {
		return userDao.getAllUser();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User getuserById(long id) {
		return userDao.getUserById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertUser(User user) {
		user.setCreationDate(new Date());
		user.setRegVerification(Helper.md5((String.valueOf(user.getCreationDate()))));
		userDao.insert(user);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateUser(User user) {
		userDao.insert(user);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User getUserByRegVerify(String regVerify) {
		return userDao.getUserByRegVerify(regVerify);
	}
}
