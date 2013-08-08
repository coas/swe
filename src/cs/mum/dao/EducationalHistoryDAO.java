package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.EducationalHistory;
import cs.mum.model.User;

public class EducationalHistoryDAO implements IEducationalHistoryDAO {

	@Autowired
	private SessionFactory sf;
	
	public void insert(EducationalHistory educationHistory) {
		sf.getCurrentSession().saveOrUpdate(educationHistory);
	}

	public List<EducationalHistory> getAllEducationalHistory() {

		@SuppressWarnings("unchecked")
		List<EducationalHistory> educationalHistory = sf.getCurrentSession()
				.createQuery("from EducationalHistory").list();

		return educationalHistory;
	}

	public EducationalHistory getEducationalHistoryById(long id) {
		EducationalHistory educationalHistory = (EducationalHistory) sf.getCurrentSession().get(
				User.class, id);
		return educationalHistory;

	}
	
}
