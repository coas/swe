package cs.mum.dao;

import java.util.List;

import cs.mum.model.InstitutionAttended;

public interface IInstitutionAttendedDAO {

	public void insert(InstitutionAttended institutionAttended);
	
	public List<InstitutionAttended> getAllInstitutionAttendeds();
	
	public InstitutionAttended getInstitutionAttendedsById(long id);
}
