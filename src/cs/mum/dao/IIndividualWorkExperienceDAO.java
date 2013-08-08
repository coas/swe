package cs.mum.dao;

import java.util.List;

import cs.mum.model.IndividualWorkExperience;

public interface IIndividualWorkExperienceDAO {

	public void insert(IndividualWorkExperience individualWorkExperience);
	
	public List<IndividualWorkExperience> getAllIndividualWorkExperince();
	
	public IndividualWorkExperience getIndividualWorkExperiencesById(long id);
}
