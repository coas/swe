package cs.mum.dao;

import java.util.List;

import cs.mum.model.ProgLangExperienceValue;

public interface IProgLangExperienceValueDAO {

	public void insert(ProgLangExperienceValue progLangExperienceValue);
	
	public List<ProgLangExperienceValue> getAllProgLangExperienceValue();
	
	public ProgLangExperienceValue getProgLangExperienceValueById(long id);
}
