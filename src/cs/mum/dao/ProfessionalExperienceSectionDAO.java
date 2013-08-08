package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.ProfessionalExperienceSection;
import cs.mum.model.User;

public class ProfessionalExperienceSectionDAO implements IProfessionalExperienceSectionDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(ProfessionalExperienceSection professionalExperienceSection) {
		sf.getCurrentSession().saveOrUpdate(professionalExperienceSection);
	}

	public List<ProfessionalExperienceSection> getAllProfessionalExperienceSections() {

		@SuppressWarnings("unchecked")
		List<ProfessionalExperienceSection> professionalExperienceSections = sf.getCurrentSession()
				.createQuery("from User").list();

		return professionalExperienceSections;
	}

	public ProfessionalExperienceSection getProfessionalExprienceSectionById(long id) {
		ProfessionalExperienceSection professionalExperienceSection = (ProfessionalExperienceSection) sf.getCurrentSession().get(
				User.class, id);
		return professionalExperienceSection;

	}
}
