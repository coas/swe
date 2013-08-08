package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class ProgLangExperienceValue implements IProgLangExperienceValue  {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(ProgLangExperienceValue progLangExperienceValue) {
		sf.getCurrentSession().saveOrUpdate(progLangExperienceValue);
	}

	public List<ProgLangExperienceValue> getAllProgLangExperienceValue() {

		@SuppressWarnings("unchecked")
		List<ProgLangExperienceValue> progLangExperienceValues = sf.getCurrentSession()
				.createQuery("from ProgLangExperienceValue").list();

		return progLangExperienceValues;
	}

	public ProgLangExperienceValue getProgLangExperienceValueById(long id) {
		ProgLangExperienceValue progLangExperienceValue = (ProgLangExperienceValue) sf.getCurrentSession().get(
				ProgLangExperienceValue.class, id);
		return progLangExperienceValue;

	}
	
}
