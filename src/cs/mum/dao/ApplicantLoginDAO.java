package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.User;
import cs.mum.model.UserLogin;

public class ApplicantLoginDAO implements IApplicantLoginDAO {
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UserLogin applicant) {
		sf.getCurrentSession().saveOrUpdate(applicant);
	}

	public List<UserLogin> getAllApplicantLogin() {

		@SuppressWarnings("unchecked")
		List<UserLogin> applicant = sf.getCurrentSession()
				.createQuery("from ApplicantLogin").list();

		return applicant;
	}

	@Override
	public UserLogin getApplicationLoginById(long id) {
		UserLogin applicant = (UserLogin) sf.getCurrentSession().get(
				User.class, id);
		return applicant;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLogin> getApplicantLoginByUsernamePassword(String userName,
			String passWord) {
		String sql="from ApplicantLogin l where l.userName=:username " +
				"and l.password=MD5(:password) and l.applicant.status=1";
		Query query=sf.getCurrentSession().createQuery(sql);
		query.setParameter("username", userName);
		query.setParameter("password", passWord);
		
		return  query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLogin> getApplicantByEmailAddress(String username) {
		String sql = "FROM ApplicantLogin WHERE userName=:username";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("username", username);
		return query.list();
	}

	@Override
	public UserLogin getApplicantLoginByCdatePassword(String cdate, String pwd) {
		String sql = "FROM ApplicantLogin l WHERE password=:pwd";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("pwd", pwd);
		return (UserLogin)query.uniqueResult();
	}

}
