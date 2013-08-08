package cs.mum.dao;

import java.util.List;

import cs.mum.model.Country;

public interface ICountryDAO {

	public List<Country> getAllCountry();
	
	public Country getCountryById(long id);
	
	public void insert(Country country);
}
