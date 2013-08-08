package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.ProgrammingLanguage;


public class ProgrammingLanguageDAO implements IProgrammingLanguageDAO  {
 
	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(ProgrammingLanguage programmingLanguage) {
		sf.getCurrentSession().saveOrUpdate(programmingLanguage);
	}

	public List<ProgrammingLanguage> getAllProgrammingLanguage() {

		@SuppressWarnings("unchecked")
		List<ProgrammingLanguage> programmingLanguages = sf.getCurrentSession()
				.createQuery("from ProgrammingLanguage").list();

		return programmingLanguages;
	}

	public ProgrammingLanguage getProgrammingLanguageById(long id) {
		ProgrammingLanguage programmingLanguage = (ProgrammingLanguage) sf.getCurrentSession().get(
				ProgrammingLanguage.class, id);
		return programmingLanguage;

	}
}
