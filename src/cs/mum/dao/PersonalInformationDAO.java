package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.PersonalInformation;


public class PersonalInformationDAO implements IPersonalInformationDAO  {

	@Autowired
	private SessionFactory sf;

	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}

	public void insert(PersonalInformation personalInformation) {
		sf.getCurrentSession().saveOrUpdate(personalInformation);
	}

	public List<PersonalInformation> getAllPersonalInformation() {

		@SuppressWarnings("unchecked")
		List<PersonalInformation> personalInformations = sf.getCurrentSession()
				.createQuery("from PersonalInformation").list();

		return personalInformations;
	}

	public PersonalInformation getUserById(long id) {
		PersonalInformation personalInformation = (PersonalInformation) sf.getCurrentSession().get(
				PersonalInformation.class, id);
		return personalInformation;

	}
}
