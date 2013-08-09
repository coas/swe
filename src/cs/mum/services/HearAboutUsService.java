package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IHearAboutUsDAO;
import cs.mum.model.HearAboutUs;
@Service
public class HearAboutUsService {
	@Autowired
	private IHearAboutUsDAO hearAboutUsDAO;
	
	public void setHearAboutUsDAO(IHearAboutUsDAO hearAboutUsDAO) {
		this.hearAboutUsDAO = hearAboutUsDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<HearAboutUs> getListOfHearAboutUs() {
		return hearAboutUsDAO.getListOfHearAboutUs();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public HearAboutUs getHearAboutUsById(long id) {
		return hearAboutUsDAO.getHearAboutUsById(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(HearAboutUs hearAboutUs) {
		hearAboutUsDAO.insert(hearAboutUs);
	}
}
