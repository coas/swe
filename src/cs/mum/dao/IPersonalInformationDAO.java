package cs.mum.dao;

import java.util.List;

import cs.mum.model.PersonalInformation;

public interface IPersonalInformationDAO {

	public void insert(PersonalInformation personalInformation);
	
	public List<PersonalInformation> getAllPersonalInformation();
	
	public PersonalInformation getUserById(long id);
}
