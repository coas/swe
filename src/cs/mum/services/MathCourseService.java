package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IMathCourseDAO;
import cs.mum.model.MathCourse;


@Service
public class MathCourseService {
 
	@Autowired
	private IMathCourseDAO countryDAO;

	
	public void setCountryDAO(IMathCourseDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(MathCourse mathCourse) {
		countryDAO.insert(mathCourse);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<MathCourse> listOfMathCourses() {
		return countryDAO.getAllMathCourse();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public MathCourse getMathCourseById(long id) {
		return countryDAO.getMathCourseById(id);
	}
}
