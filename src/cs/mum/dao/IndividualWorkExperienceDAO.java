package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.IndividualWorkExperience;


public class IndividualWorkExperienceDAO implements IIndividualWorkExperienceDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(IndividualWorkExperience individualWorkExperience) {
		sf.getCurrentSession().saveOrUpdate(individualWorkExperience);
	}

	public List<IndividualWorkExperience> getAllIndividualWorkExperince() {

		@SuppressWarnings("unchecked")
		List<IndividualWorkExperience> individualWorkExperiences = sf.getCurrentSession()
				.createQuery("from IndividualWorkExperiences").list();

		return individualWorkExperiences;
	}

	public IndividualWorkExperience getIndividualWorkExperiencesById(long id) {
		IndividualWorkExperience individualWorkExperience = (IndividualWorkExperience) sf.getCurrentSession().get(
				IndividualWorkExperience.class, id);
		return individualWorkExperience;

	}
}
