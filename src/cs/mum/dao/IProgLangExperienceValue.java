package cs.mum.dao;

import java.util.List;

public interface IProgLangExperienceValue {

	public void insert(ProgLangExperienceValue progLangExperienceValue);
	
	public List<ProgLangExperienceValue> getAllProgLangExperienceValue();
	
	public ProgLangExperienceValue getProgLangExperienceValueById(long id);
}
