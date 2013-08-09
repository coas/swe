package cs.mum.dao;

import java.util.List;

import cs.mum.model.HearAboutUs;

public interface IHearAboutUsDAO {
	public List<HearAboutUs> getListOfHearAboutUs();
	public HearAboutUs getHearAboutUsById(long id);
	public void insert(HearAboutUs hearAboutUs);
}
