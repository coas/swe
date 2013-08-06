package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.User;
public class ApplicantDAO implements IApplicantDAO{
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(User applicant) {
		sf.getCurrentSession().saveOrUpdate(applicant);
	}

	public List<User> getAllApplicant() {

		@SuppressWarnings("unchecked")
		List<User> applicant = sf.getCurrentSession()
				.createQuery("from Applicant").list();

		return applicant;
	}

	public User getApplicantById(long id) {
		User applicant = (User) sf.getCurrentSession().get(
				User.class, id);
		return applicant;

	}

	@Override
	public User getApplicationById(long id) {
		return null;
	}

	@Override
	public User getApplicantByRegVerify(String regVerify) {
		String sql = "from Applicant where regVerification=:pregVerify";
		Query query = sf.getCurrentSession().createQuery(sql);
		query.setParameter("pregVerify", regVerify);
		return (User)query.uniqueResult();
	}

}
