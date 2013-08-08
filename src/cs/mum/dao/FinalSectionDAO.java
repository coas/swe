package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.FinalSection;


public class FinalSectionDAO implements IFinalSectionDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(FinalSection finalSection) {
		sf.getCurrentSession().saveOrUpdate(finalSection);
	}

	public List<FinalSection> getAllFinalSections() {

		@SuppressWarnings("unchecked")
		List<FinalSection> finalsections = sf.getCurrentSession()
				.createQuery("from FinalSection").list();

		return finalsections;
	}

	public FinalSection getUserById(long id) {
		FinalSection finalSection = (FinalSection) sf.getCurrentSession().get(
				FinalSection.class, id);
		return finalSection;

	}
}
