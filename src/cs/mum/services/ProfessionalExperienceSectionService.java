package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IProfessionalExperienceSectionDAO;
import cs.mum.model.ProfessionalExperienceSection;

public class ProfessionalExperienceSectionService {

	
	@Autowired
	private IProfessionalExperienceSectionDAO professionalExperienceSectionDAO;

	
	
	

	public void setProfessionalExperienceSectionDAO(
			IProfessionalExperienceSectionDAO professionalExperienceSectionDAO) {
		this.professionalExperienceSectionDAO = professionalExperienceSectionDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(ProfessionalExperienceSection professionalExperienceSection) {
		professionalExperienceSectionDAO.insert(professionalExperienceSection);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<ProfessionalExperienceSection> listOfProfessionalExperienceSection() {
		return professionalExperienceSectionDAO.getAllProfessionalExperienceSections();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ProfessionalExperienceSection getProfessionalExperienceSectionById(long id) {
		return professionalExperienceSectionDAO.getProfessionalExprienceSectionById(id);
	}
}
