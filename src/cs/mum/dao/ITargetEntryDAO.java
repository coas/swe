package cs.mum.dao;

import java.util.List;

import cs.mum.model.TargetEntry;

public interface ITargetEntryDAO {
	public List<TargetEntry> getListOfTargetEntries();
	public TargetEntry getTargetEntryById(long id);
	public void insert(TargetEntry targetEntry);
}
