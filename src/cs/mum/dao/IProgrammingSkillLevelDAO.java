package cs.mum.dao;

import java.util.List;

import cs.mum.model.ProgrammingSkillLevel;

public interface IProgrammingSkillLevelDAO {
	
	public void insert(ProgrammingSkillLevel programmingSkillLevel);
	
	public List<ProgrammingSkillLevel> getAllProgrammingSkillLevel();
	
	public ProgrammingSkillLevel getProgrammingSkillLevelById(long id);

}
