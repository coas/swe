package cs.mum.dao;

import java.util.List;

import cs.mum.model.Application;

public interface IApplicationDAO  {

	public List<Application> getAllApplication();
	
	public Application getApplicationById(long id);
	
	public void insert(Application application);
}
