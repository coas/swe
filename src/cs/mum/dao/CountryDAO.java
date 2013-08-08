package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import cs.mum.model.Country;



public class CountryDAO implements ICountryDAO {
	@Autowired
	private SessionFactory sf;

	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	public void insert(Country country) {
		sf.getCurrentSession().saveOrUpdate(country);
	}
	
	
	public List<Country> getAllCountry() {

		@SuppressWarnings("unchecked")
		List<Country> country = sf.getCurrentSession()
				.createQuery("from Country order by description").list();

		return country;
	}
	
	public Country getCountryById(long id) {
	    Country country = (Country) sf.getCurrentSession().get(
				Country.class, id);
		return country;

	}
	

}
