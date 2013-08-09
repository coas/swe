package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IIndividualWorkExperienceDAO;
import cs.mum.model.IndividualWorkExperience;

public class IndividualWorkExperienceService {

	@Autowired
	private IIndividualWorkExperienceDAO individualWorkExperienceDAO;

	
	
	

	public void setIndividualWorkExperienceDAO(
			IIndividualWorkExperienceDAO individualWorkExperienceDAO) {
		this.individualWorkExperienceDAO = individualWorkExperienceDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(IndividualWorkExperience individualWorkExperience) {
		individualWorkExperienceDAO.insert(individualWorkExperience);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<IndividualWorkExperience> listOfIndividualWorkExperience() {
		return individualWorkExperienceDAO.getAllIndividualWorkExperince();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public IndividualWorkExperience getIndividualWorkExperienceyId(long id) {
		return individualWorkExperienceDAO.getIndividualWorkExperiencesById(id);
	}
}
