package cs.mum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PersonalInformation extends Section {
	private String sex;
	private String maritalStatus;
	private Country countryOfCitizenship;
	private Country countryOfBirth;
	private String notOnListOfCountryOfCitizenship;
	private String notOnListOfCountryOfBirth;
	private Date DateOfBirth;
	private String skypeId;
	private String phoneNumber;
	private String cityLivingNow;
	private Country countryLivingNow;
	private String notOnListOfCountryLivingNow;
	
	
	public PersonalInformation() {
	
	}
	public PersonalInformation(String sex, String maritalStatus,
			Country countryOfCitizenship, Country countryOfBirth,
			String notOnListOfCountryOfCitizenship,
			String notOnListOfCountryOfBirth, Date dateOfBirth, String skypeId,
			String phoneNumber, String cityLivingNow, Country countryLivingNow,
			String notOnListOfCountryLivingNow) {
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.countryOfCitizenship = countryOfCitizenship;
		this.countryOfBirth = countryOfBirth;
		this.notOnListOfCountryOfCitizenship = notOnListOfCountryOfCitizenship;
		this.notOnListOfCountryOfBirth = notOnListOfCountryOfBirth;
		DateOfBirth = dateOfBirth;
		this.skypeId = skypeId;
		this.phoneNumber = phoneNumber;
		this.cityLivingNow = cityLivingNow;
		this.countryLivingNow = countryLivingNow;
		this.notOnListOfCountryLivingNow = notOnListOfCountryLivingNow;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	@ManyToOne
	@JoinColumn(name="countryOfCitizenship")
	public Country getCountryOfCitizenship() {
		return countryOfCitizenship;
	}
	public void setCountryOfCitizenship(Country countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}
	@ManyToOne
	@JoinColumn(name="countryOfBirth")
	public Country getCountryOfBirth() {
		return countryOfBirth;
	}
	public void setCountryOfBirth(Country countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	public String getNotOnListOfCountryOfCitizenship() {
		return notOnListOfCountryOfCitizenship;
	}
	public void setNotOnListOfCountryOfCitizenship(
			String notOnListOfCountryOfCitizenship) {
		this.notOnListOfCountryOfCitizenship = notOnListOfCountryOfCitizenship;
	}
	public String getNotOnListOfCountryOfBirth() {
		return notOnListOfCountryOfBirth;
	}
	public void setNotOnListOfCountryOfBirth(String notOnListOfcountryOfBirth) {
		this.notOnListOfCountryOfBirth = notOnListOfcountryOfBirth;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCityLivingNow() {
		return cityLivingNow;
	}
	public void setCityLivingNow(String cityLivingNow) {
		this.cityLivingNow = cityLivingNow;
	}
	@ManyToOne
	@JoinColumn(name="countryLivingNow")
	public Country getCountryLivingNow() {
		return countryLivingNow;
	}
	public void setCountryLivingNow(Country countryLivingNow) {
		this.countryLivingNow = countryLivingNow;
	}
	public String getNotOnListOfCountryLivingNow() {
		return notOnListOfCountryLivingNow;
	}
	public void setNotOnListOfCountryLivingNow(String notOnListOfCountryLivingNow) {
		this.notOnListOfCountryLivingNow = notOnListOfCountryLivingNow;
	}
	
	
}
