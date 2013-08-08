package cs.mum.dao;

import java.util.List;

import cs.mum.model.ProgrammingLanguage;

public interface IProgrammingLanguageDAO {

	public void insert(ProgrammingLanguage programmingLanguage);
	
	public List<ProgrammingLanguage> getAllProgrammingLanguage();
	
	public ProgrammingLanguage getProgrammingLanguageById(long id);
}
