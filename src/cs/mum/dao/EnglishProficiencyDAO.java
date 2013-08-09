package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.EnglishProficiency;


public class EnglishProficiencyDAO implements IEnglishProficiencyDAO{
	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(EnglishProficiency englishProficiency) {
		sf.getCurrentSession().saveOrUpdate(englishProficiency);
	}

	public List<EnglishProficiency> getAllUser() {

		@SuppressWarnings("unchecked")
		List<EnglishProficiency> englishProficiencies = sf.getCurrentSession()
				.createQuery("from EnglishProficiency").list();

		return englishProficiencies;
	}

	public EnglishProficiency getUserById(long id) {
		EnglishProficiency englishProficiency = (EnglishProficiency) sf.getCurrentSession().get(
			 EnglishProficiency.class, id);
		return englishProficiency;

	}
}
