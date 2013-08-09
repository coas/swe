package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.IInstitutionAttendedDAO;
import cs.mum.model.InstitutionAttended;

public class InstitutionAttendedService {

	@Autowired
	private IInstitutionAttendedDAO nstitutionAttendeddao;

	
	
	

	public void setNstitutionAttendeddao(
			IInstitutionAttendedDAO nstitutionAttendeddao) {
		this.nstitutionAttendeddao = nstitutionAttendeddao;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(InstitutionAttended institutionAttended) {
		nstitutionAttendeddao.insert(institutionAttended);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<InstitutionAttended> listOfInstitutionAttended() {
		return nstitutionAttendeddao.getAllInstitutionAttendeds();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public InstitutionAttended getInstitutionAttendedById(long id) {
		return nstitutionAttendeddao.getInstitutionAttendedsById(id);
	}
}
