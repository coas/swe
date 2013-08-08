package cs.mum.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs.mum.dao.ICountryDAO;
import cs.mum.model.Country;

@Service
public class CountryService {
	@Autowired
	private ICountryDAO countryDAO;

	public void setCountryDAO(ICountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insert(Country country) {
		countryDAO.insert(country);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Country> listOfCountries() {
		return countryDAO.getAllCountry();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Country getCountryById(long id) {
		return countryDAO.getCountryById(id);
	}
}
