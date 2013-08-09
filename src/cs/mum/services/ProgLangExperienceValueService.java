package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IProgLangExperienceValueDAO;
import cs.mum.model.ProgLangExperienceValue;

public class ProgLangExperienceValueService {

	@Autowired
	private IProgLangExperienceValueDAO progLangExperienceValueDAO;

	

	public void setProgLangExperienceValueDAO(
			IProgLangExperienceValueDAO progLangExperienceValueDAO) {
		this.progLangExperienceValueDAO = progLangExperienceValueDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(ProgLangExperienceValue progLangExperienceValue) {
		progLangExperienceValueDAO.insert(progLangExperienceValue);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<ProgLangExperienceValue> listOfProgLangExperienceValue() {
		return progLangExperienceValueDAO.getAllProgLangExperienceValue();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ProgLangExperienceValue getProgLangExperienceValueById(long id) {
		return progLangExperienceValueDAO.getProgLangExperienceValueById(id);
	}
}
