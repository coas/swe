package cs.mum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.HearAboutUs;

public class HearAboutUsDAO implements IHearAboutUsDAO {
	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HearAboutUs> getListOfHearAboutUs() {
		Query query = sf.getCurrentSession().createQuery("FROM HearAboutUs WHERE status=:status order by " +
				"description");
		query.setParameter("status", true);
		return query.list();
	}

	@Override
	public HearAboutUs getHearAboutUsById(long id) {
		HearAboutUs hearAboutUs = (HearAboutUs)sf.getCurrentSession().get(HearAboutUs.class, id);
		return hearAboutUs;
	}

	@Override
	public void insert(HearAboutUs hearAboutUs) {
		sf.getCurrentSession().saveOrUpdate(hearAboutUs);
	}
}
