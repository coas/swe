package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.UnivLevProgCourse;


public class UnivLevProgCourseDAO implements IUnivLevProgCourseDAO{
	
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UnivLevProgCourse univLevProgCourse) {
		sf.getCurrentSession().saveOrUpdate(univLevProgCourse);
	}

	public List<UnivLevProgCourse> getAllUnivLevProgCourse() {

		@SuppressWarnings("unchecked")
		List<UnivLevProgCourse> univLevProgCourses = sf.getCurrentSession()
				.createQuery("from UnivLevProgCourse").list();

		return univLevProgCourses;
	}

	public UnivLevProgCourse getUnivLevProgCourseById(long id) {
		UnivLevProgCourse univLevProgCourse = (UnivLevProgCourse) sf.getCurrentSession().get(
				UnivLevProgCourse.class, id);
		return univLevProgCourse;

	}

}
