package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.Section;


public class SectionDAO implements ISectionDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(Section section) {
		sf.getCurrentSession().saveOrUpdate(section);
	}

	public List<Section> getAllSection() {

		@SuppressWarnings("unchecked")
		List<Section> section = sf.getCurrentSession()
				.createQuery("from Section").list();

		return section;
	}

	public Section getSectionById(long id) {
		Section section = (Section) sf.getCurrentSession().get(
				Section.class, id);
		return section;

	}
}
