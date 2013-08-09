package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class UnivLevDataStructCourse implements IUnivLevDataStructCourseDAO {
	
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UnivLevDataStructCourse univDataStructCourse) {
		sf.getCurrentSession().saveOrUpdate(univDataStructCourse);
	}

	public List<UnivLevDataStructCourse> getAllUnivDataStructCourse() {

		@SuppressWarnings("unchecked")
		List<UnivLevDataStructCourse> univLevDataStructCourses = sf.getCurrentSession()
				.createQuery("from UnivLevDataStructCourse").list();

		return univLevDataStructCourses;
	}

	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id) {
		UnivLevDataStructCourse univLevDataStructCourse = (UnivLevDataStructCourse) sf.getCurrentSession().get(
				UnivLevDataStructCourse.class, id);
		return univLevDataStructCourse;

	}

	
}
