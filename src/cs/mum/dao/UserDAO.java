package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.User;
public class UserDAO implements IUserDAO{
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(User user) {
		sf.getCurrentSession().saveOrUpdate(user);
	}

	public List<User> getAllUser() {

		@SuppressWarnings("unchecked")
		List<User> user = sf.getCurrentSession()
				.createQuery("from User").list();

		return user;
	}

	public User getUserById(long id) {
		User user = (User) sf.getCurrentSession().get(
				User.class, id);
		return user;

	}

	@Override
	public User getUserByRegVerify(String regVerify) {
		String sql = "from User where regVerification=:pregVerify";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("pregVerify", regVerify);
		return (User)query.uniqueResult();
	}

}
