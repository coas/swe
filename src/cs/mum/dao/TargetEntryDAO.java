package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.TargetEntry;

public class TargetEntryDAO implements ITargetEntryDAO {
	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<TargetEntry> getListOfTargetEntries() {
		@SuppressWarnings("unchecked")
		List<TargetEntry> list = sf.getCurrentSession().createQuery("FROM TargetEntry order by id " +
				"and status=Y").list();
		return list;
	}

	@Override
	public TargetEntry getTargetEntryById(long id) {
		TargetEntry targetEntry = (TargetEntry)sf.getCurrentSession().get(TargetEntry.class, id);
		return targetEntry;
	}

	@Override
	public void insert(TargetEntry targetEntry) {
		sf.getCurrentSession().saveOrUpdate(targetEntry);
	}

}
