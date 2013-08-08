package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.ProgrammingSkillLevel;


public class ProgrammingSkillLevelDAO implements IProgrammingSkillLevelDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(ProgrammingSkillLevel programmingSkillLevel) {
		sf.getCurrentSession().saveOrUpdate(programmingSkillLevel);
	}

	public List<ProgrammingSkillLevel> getAllProgrammingSkillLevel() {

		@SuppressWarnings("unchecked")
		List<ProgrammingSkillLevel> programmingSkillLevels = sf.getCurrentSession()
				.createQuery("from ProgrammingSkillLevel").list();

		return programmingSkillLevels;
	}

	public ProgrammingSkillLevel getProgrammingSkillLevelById(long id) {
		ProgrammingSkillLevel programmingSkillLevel = (ProgrammingSkillLevel) sf.getCurrentSession().get(
				ProgrammingSkillLevel.class, id);
		return programmingSkillLevel;

	}
}
