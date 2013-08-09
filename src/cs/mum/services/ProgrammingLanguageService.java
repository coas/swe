package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IProgrammingLanguageDAO;
import cs.mum.model.ProgrammingLanguage;

public class ProgrammingLanguageService {

	@Autowired
	private IProgrammingLanguageDAO programmingLanguageDAO;

	

	public void setProgrammingLanguageDAO(
			IProgrammingLanguageDAO programmingLanguageDAO) {
		this.programmingLanguageDAO = programmingLanguageDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(ProgrammingLanguage programmingLanguage) {
		programmingLanguageDAO.insert(programmingLanguage);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<ProgrammingLanguage> listOfProgrammingLanguage() {
		return programmingLanguageDAO.getAllProgrammingLanguage();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ProgrammingLanguage getProgrammingLanguageById(long id) {
		return programmingLanguageDAO.getProgrammingLanguageById(id);
	}
}
