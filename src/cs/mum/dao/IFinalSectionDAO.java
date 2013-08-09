package cs.mum.dao;

import java.util.List;

import cs.mum.model.FinalSection;

public interface IFinalSectionDAO {

	public void insert(FinalSection finalSection);
	
	public List<FinalSection> getAllFinalSections();
	
	public FinalSection getFinalSectionById(long id);
}
