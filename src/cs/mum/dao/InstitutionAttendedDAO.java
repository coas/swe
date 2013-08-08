package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.InstitutionAttended;


public class InstitutionAttendedDAO implements IInstitutionAttendedDAO {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(InstitutionAttended institutionAttended) {
		sf.getCurrentSession().saveOrUpdate(institutionAttended);
	}

	public List<InstitutionAttended> getAllInstitutionAttendeds() {

		@SuppressWarnings("unchecked")
		List<InstitutionAttended> institutionAttendeds = sf.getCurrentSession()
				.createQuery("from InstitutionAttended").list();

		return institutionAttendeds;
	}

	public InstitutionAttended getInstitutionAttendedsById(long id) {
		InstitutionAttended institutionAttended = (InstitutionAttended) sf.getCurrentSession().get(
				InstitutionAttended.class, id);
		return institutionAttended;

	}
}
