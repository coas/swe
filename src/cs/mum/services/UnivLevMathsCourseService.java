package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IUnivLevMathsCourseDAO;
import cs.mum.model.UnivLevMathsCourse;

public class UnivLevMathsCourseService {

	@Autowired
	private IUnivLevMathsCourseDAO univLevMathsCourseDAO;

	

	public void setUnivLevMathsCourseDAO(
			IUnivLevMathsCourseDAO univLevMathsCourseDAO) {
		this.univLevMathsCourseDAO = univLevMathsCourseDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(UnivLevMathsCourse univLevMathsCourse) {
		univLevMathsCourseDAO.insert(univLevMathsCourse);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UnivLevMathsCourse> listOfUnivLevMathsCourses() {
		return univLevMathsCourseDAO.getAllUnivLevMathsCourse();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UnivLevMathsCourse getUnivLevMathsCourseById(long id) {
		return univLevMathsCourseDAO.getUnivLevMathsCourseById(id);
	}
}
