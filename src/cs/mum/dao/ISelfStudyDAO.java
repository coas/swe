package cs.mum.dao;

import java.util.List;

import cs.mum.model.SelfStudy;

public interface ISelfStudyDAO {

	public void insert(SelfStudy selfStudy);
	
	public List<SelfStudy> getAllSelfStudy();
	
	public SelfStudy getSelfStudyById(long id);
}
