package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.User;
import cs.mum.model.UserLogin;

public class UserLoginDAO implements IUserLoginDAO {
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UserLogin user) {
		sf.getCurrentSession().saveOrUpdate(user);
	}

	public List<UserLogin> getAllUserLogin() {

		@SuppressWarnings("unchecked")
		List<UserLogin> user = sf.getCurrentSession()
				.createQuery("from UserLogin").list();

		return user;
	}

	@Override
	public UserLogin getUserLoginById(long id) {
		UserLogin user = (UserLogin) sf.getCurrentSession().get(
				User.class, id);
		return user;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLogin> getUserLoginByUsernamePassword(String userName, String passWord) {
		String sql="from UserLogin l where l.userName=:username " +
				"and l.password=MD5(:password) and l.user.status=1";
		Query query=sf.getCurrentSession().createQuery(sql);
		query.setParameter("username", userName);
		query.setParameter("password", passWord);
		
		return  query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLogin> getUserByEmailAddress(String username) {
		String sql = "FROM UserLogin WHERE userName=:username";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("username", username);
		return query.list();
	}

	@Override
	public UserLogin getUserLoginByCdatePassword(String cdate, String pwd) {
		String sql = "FROM UserLogin l WHERE password=:pwd";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("pwd", pwd);
		return (UserLogin)query.uniqueResult();
	}

}
