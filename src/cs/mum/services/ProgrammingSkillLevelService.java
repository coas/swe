package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IProgrammingSkillLevelDAO;
import cs.mum.model.ProgrammingSkillLevel;

public class ProgrammingSkillLevelService {

	@Autowired
	private IProgrammingSkillLevelDAO programmingSkillLevelDAO;

	

	public void setProgrammingSkillLevelDAO(
			IProgrammingSkillLevelDAO programmingSkillLevelDAO) {
		this.programmingSkillLevelDAO = programmingSkillLevelDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(ProgrammingSkillLevel programmingSkillLevel) {
		programmingSkillLevelDAO.insert(programmingSkillLevel);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<ProgrammingSkillLevel> listOfProgrammingSkillLevels() {
		return programmingSkillLevelDAO.getAllProgrammingSkillLevel();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ProgrammingSkillLevel getProgrammingSkillLevelById(long id) {
		return programmingSkillLevelDAO.getProgrammingSkillLevelById(id);
	}
}
