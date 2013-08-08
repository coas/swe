package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.UnivLevMathsCourse;


public class UnivLevMathsCourseDAO implements IUnivLevMathsCourseDAO  {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(UnivLevMathsCourse univLevMathsCourse) {
		sf.getCurrentSession().saveOrUpdate(univLevMathsCourse);
	}

	public List<UnivLevMathsCourse> getAllUnivLevMathsCourse() {

		@SuppressWarnings("unchecked")
		List<UnivLevMathsCourse> univLevMathsCourses = sf.getCurrentSession()
				.createQuery("from UnivLevMathsCourse").list();

		return univLevMathsCourses;
	}

	public UnivLevMathsCourse getUnivLevMathsCourseById(long id) {
		UnivLevMathsCourse univLevMathsCourse = (UnivLevMathsCourse) sf.getCurrentSession().get(
				UnivLevMathsCourse.class, id);
		return univLevMathsCourse;

	}
}
