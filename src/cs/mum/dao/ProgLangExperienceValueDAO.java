package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.ProgLangExperienceValue;

public class ProgLangExperienceValueDAO {

	@Autowired
	private SessionFactory sf;

	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	public void insert(ProgLangExperienceValue progLangExperienceValue) {
		sf.getCurrentSession().saveOrUpdate(progLangExperienceValue);
	}
	
	
	public List<ProgLangExperienceValue> getAllProgLangExperienceValue() {

		@SuppressWarnings("unchecked")
		List<ProgLangExperienceValue> progLangExperienceValue = sf.getCurrentSession()
				.createQuery("from ProgLangExperienceValue order by description").list();

		return progLangExperienceValue;
	}
	
	public ProgLangExperienceValue getProgLangExperienceValueById(long id) {
		ProgLangExperienceValue progLangExperienceValue = (ProgLangExperienceValue) sf.getCurrentSession().get(
				ProgLangExperienceValue.class, id);
		return progLangExperienceValue;

	}
}
