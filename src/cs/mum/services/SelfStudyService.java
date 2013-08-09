package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.ISelfStudyDAO;
import cs.mum.model.SelfStudy;

public class SelfStudyService {

	@Autowired
	private ISelfStudyDAO selfStudyDao;

	
	
	

	public void setSelfStudyDao(ISelfStudyDAO selfStudyDao) {
		this.selfStudyDao = selfStudyDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(SelfStudy selfStudy) {
		selfStudyDao.insert(selfStudy);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<SelfStudy> listOfSelfStudies() {
		return selfStudyDao.getAllSelfStudy();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public SelfStudy getSelfStudyById(long id) {
		return selfStudyDao.getSelfStudyById(id);
	}
}
