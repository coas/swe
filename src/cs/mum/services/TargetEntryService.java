package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.ITargetEntryDAO;
import cs.mum.model.TargetEntry;

@Service
public class TargetEntryService {
	@Autowired
	private ITargetEntryDAO targetEntryDAO;

	public void setTargetEntryDAO(ITargetEntryDAO targetEntryDAO) {
		this.targetEntryDAO = targetEntryDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<TargetEntry> getListOfTargetEntries() {
		return targetEntryDAO.getListOfTargetEntries();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public TargetEntry getTargetEntryById(long id) {
		return targetEntryDAO.getTargetEntryById(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(TargetEntry targetEntry) {
		targetEntryDAO.insert(targetEntry);
	}
}
