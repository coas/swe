package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.Application;



public class ApplicationDAO implements IApplicationDAO {

	@Autowired
	private SessionFactory sf;

	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public void insert(Application application) {
		sf.getCurrentSession().saveOrUpdate(application);
	}
	
	public List<Application> getAllApplication(){
		@SuppressWarnings("unchecked")
		List<Application> applications = sf.getCurrentSession()
				.createQuery("from Application").list();

		return applications;
	}
	
	public Application getApplicationById(long id) {
	    Application application = (Application) sf.getCurrentSession().get(
				Application.class, id);
		return application;

	}


	
	
}
