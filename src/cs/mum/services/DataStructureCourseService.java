package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IDataStructureCourseDAO;


import cs.mum.model.DataStructureCourse;

@Service
public class DataStructureCourseService {

	@Autowired
	private IDataStructureCourseDAO dataStructureCourseDAO;

	public void setDataStructureCourseDAO(IDataStructureCourseDAO dataStructureCourseDAO) {
		this.dataStructureCourseDAO = dataStructureCourseDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(DataStructureCourse dataStructureCourse) {
		dataStructureCourseDAO.insert(dataStructureCourse);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<DataStructureCourse> listOfDataStructureCourses() {
		return dataStructureCourseDAO.getAllDataStructureCourse();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public DataStructureCourse getDataStructurCourseById(long id) {
		return dataStructureCourseDAO.getDataStructureCourseById(id);
	}
}
