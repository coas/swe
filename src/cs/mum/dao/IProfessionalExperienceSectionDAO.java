package cs.mum.dao;

import java.util.List;

import cs.mum.model.ProfessionalExperienceSection;

public interface IProfessionalExperienceSectionDAO {

	public void insert(ProfessionalExperienceSection professionalExperienceSection);
	
	public List<ProfessionalExperienceSection> getAllProfessionalExperienceSections();
	
	public ProfessionalExperienceSection getProfessionalExprienceSectionById(long id);
}
