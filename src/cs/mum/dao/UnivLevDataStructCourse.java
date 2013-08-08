package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.User;

public class UnivLevDataStructCourse implements IUnivLevDataStructCourse {
	
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UnivLevDataStructCourse univdDataStructCourse) {
		sf.getCurrentSession().saveOrUpdate(univdDataStructCourse);
	}

	public List<UnivLevDataStructCourse> getAllUnivdDataStructCourse() {

		@SuppressWarnings("unchecked")
		List<UnivLevDataStructCourse> univLevDataStructCourses = sf.getCurrentSession()
				.createQuery("from UnivLevDataStructCourse").list();

		return univLevDataStructCourses;
	}

	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id) {
		UnivLevDataStructCourse univLevDataStructCourse = (UnivLevDataStructCourse) sf.getCurrentSession().get(
				User.class, id);
		return univLevDataStructCourse;

	}

}
