package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IUnivLevDataStructCourseDAO;
import cs.mum.model.UnivLevDataStructCourse;

public class UnivLevDataStructCourseService {

	@Autowired
	private IUnivLevDataStructCourseDAO univLevDataStructCourseDAO;

	

	public void setUnivLevDataStructCourseDAO(
			IUnivLevDataStructCourseDAO univLevDataStructCourseDAO) {
		this.univLevDataStructCourseDAO = univLevDataStructCourseDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(UnivLevDataStructCourse univLevDataStructCourse) {
		univLevDataStructCourseDAO.insert(univLevDataStructCourse);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<UnivLevDataStructCourse> listOfUnivLevDataStructCourse() {
		return univLevDataStructCourseDAO.getAllUnivLevDataStructCourse();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id) {
		return univLevDataStructCourseDAO.getUnivLevDataStructCourseById(id);
	}
}
