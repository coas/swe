package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.MathCourse;


public class MathCourseDAO implements IMathCourseDAO  {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(MathCourse mathCourse) {
		sf.getCurrentSession().saveOrUpdate(mathCourse);
	}

	public List<MathCourse> getAllMathCourse() {

		@SuppressWarnings("unchecked")
		List<MathCourse> mathCourses = sf.getCurrentSession()
				.createQuery("from MathCourse").list();

		return mathCourses;
	}

	public MathCourse getMathCourseById(long id) {
		MathCourse mathCourse = (MathCourse) sf.getCurrentSession().get(
				MathCourse.class, id);
		return mathCourse;

	}
}
