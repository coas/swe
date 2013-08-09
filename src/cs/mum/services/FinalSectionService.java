package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IFinalSectionDAO;
import cs.mum.model.FinalSection;

@Service
public class FinalSectionService {

	@Autowired
	private IFinalSectionDAO finalSectionDAO;
    	
	
	public void setFinalSectionDAO(IFinalSectionDAO finalSectionDAO) {
		this.finalSectionDAO = finalSectionDAO;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(FinalSection finalSection) {
		finalSectionDAO.insert(finalSection);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<FinalSection> listOfFinalSectionDAO() {
		return finalSectionDAO.getAllFinalSections();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public FinalSection getFinalSectionDAOById(long id) {
		return finalSectionDAO.getFinalSectionById(id);
	}
}
