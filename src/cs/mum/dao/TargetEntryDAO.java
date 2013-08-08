package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
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
		Query query = sf.getCurrentSession().createQuery("FROM TargetEntry WHERE " +
				" status=:status order by id");
		query.setParameter("status", true);
		@SuppressWarnings("unchecked")
		List<TargetEntry> list = query.list();
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
