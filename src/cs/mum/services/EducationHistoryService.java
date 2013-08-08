package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IEducationalHistoryDAO;
import cs.mum.model.EducationalHistory;

public class EducationHistoryService {

	@Autowired
	private IEducationalHistoryDAO educationalHistoryDAO;

	public void setEducationalHistoryDAO(IEducationalHistoryDAO educationalHistoryDAO) {
		this.educationalHistoryDAO = educationalHistoryDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(EducationalHistory educationalHistory) {
		educationalHistoryDAO.insert(educationalHistory);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<EducationalHistory> listOfEducationalHistoryS() {
		return educationalHistoryDAO.getAllEducationalHistory();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public EducationalHistory getEducationalHistoryById(long id) {
		return educationalHistoryDAO.getEducationalHistoryById(id);
	}
	
}
