package cs.mum.dao;

import java.util.List;

import cs.mum.model.EducationalHistory;

public interface IEducationalHistoryDAO {

	
	public void insert(EducationalHistory educationHistory);
	
	public List<EducationalHistory> getAllEducationalHistory();
	
	public EducationalHistory getEducationalHistoryById(long id);
}
