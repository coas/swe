package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.SelfStudy;


public class SelfStudyDAO implements ISelfStudyDAO{

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(SelfStudy selfStudy) {
		sf.getCurrentSession().saveOrUpdate(selfStudy);
	}

	public List<SelfStudy> getAllSelfStudy() {

		@SuppressWarnings("unchecked")
		List<SelfStudy> selfStudies = sf.getCurrentSession()
				.createQuery("from SelfStudy").list();

		return selfStudies;
	}

	public SelfStudy getSelfStudyById(long id) {
		SelfStudy selfStudy = (SelfStudy) sf.getCurrentSession().get(
				SelfStudy.class, id);
		return selfStudy;

	}
	
}
