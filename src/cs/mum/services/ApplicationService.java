package cs.mum.services;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IApplicationDAO;


import cs.mum.model.Application;

public class ApplicationService {

	@Autowired
	private IApplicationDAO applicationDao  ;

	public void setUserDao(IApplicationDAO applicationDao) {
		this.applicationDao = applicationDao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<Application> getApplications() {
		return applicationDao.getAllApplication();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Application getApplicationId(long id) {
		return applicationDao.getApplicationById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertApplication(Application application) {	
		
		applicationDao.insert(application);
	}
	
	
}
