package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IUnivLevProgCourseDAO;
import cs.mum.model.UnivLevProgCourse;

public class UnivLevProgCourseService {

	@Autowired
	private IUnivLevProgCourseDAO univLevProgCourseDAO;

	

	public void setUnivLevProgCourseDAO(IUnivLevProgCourseDAO univLevProgCourseDAO) {
		this.univLevProgCourseDAO = univLevProgCourseDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(UnivLevProgCourse univLevProgCourse) {
		univLevProgCourseDAO.insert(univLevProgCourse);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UnivLevProgCourse> listOfUnivLevProgCourse() {
		return univLevProgCourseDAO.getAllUnivLevProgCourse();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UnivLevProgCourse getUnivLevProgCourseById(long id) {
		return univLevProgCourseDAO.getUnivLevProgCourseById(id);
	}
}
