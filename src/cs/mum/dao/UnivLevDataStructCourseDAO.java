package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



import cs.mum.model.UnivLevDataStructCourse;

public class UnivLevDataStructCourseDAO {

	@Autowired
	private SessionFactory sf;

	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	public void insert(UnivLevDataStructCourse univLevDataStructCourse) {
		sf.getCurrentSession().saveOrUpdate(univLevDataStructCourse);
	}
	
	
	public List<UnivLevDataStructCourse> getAllUnivLevDataStructCourse() {

		@SuppressWarnings("unchecked")
		List<UnivLevDataStructCourse> univLevDataStructCourse = sf.getCurrentSession()
				.createQuery("from Country order by description").list();

		return univLevDataStructCourse;
	}
	
	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id) {
		UnivLevDataStructCourse univLevDataStructCourse = (UnivLevDataStructCourse) sf.getCurrentSession().get(
				UnivLevDataStructCourse.class, id);
		return univLevDataStructCourse;

	}
}
