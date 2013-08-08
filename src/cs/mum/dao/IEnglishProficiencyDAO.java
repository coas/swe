package cs.mum.dao;

import java.util.List;

import cs.mum.model.EnglishProficiency;

public interface IEnglishProficiencyDAO {

	public void insert(EnglishProficiency englishProficiency);
	
	public List<EnglishProficiency> getAllUser();
	
	public EnglishProficiency getUserById(long id);
}
