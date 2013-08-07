package cs.mum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InstitutionAttended {
	private long id;
	private String InstitutionName;
	private String location;
	private Date dateFrom;
	private Date dateTo;
	private String degreeGranted;
	private String subjectArea;
	private double gpa;
	private Date cDate;
	private EducationalHistory educationalHistory;
	
	
	public InstitutionAttended() {
		
	}
	public InstitutionAttended(String institutionName, String location,
			Date dateFrom, Date dateTo, String degreeGranted,
			String subjectArea, double gpa,
			EducationalHistory educationalHistory, Date cdate) {
		InstitutionName = institutionName;
		this.location = location;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.degreeGranted = degreeGranted;
		this.subjectArea = subjectArea;
		this.gpa = gpa;
		this.educationalHistory = educationalHistory;
		this.cDate=cdate;
	}
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getInstitutionName() {
		return InstitutionName;
	}
	public void setInstitutionName(String institutionName) {
		InstitutionName = institutionName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public String getDegreeGranted() {
		return degreeGranted;
	}
	public void setDegreeGranted(String degreeGranted) {
		this.degreeGranted = degreeGranted;
	}
	public String getSubjectArea() {
		return subjectArea;
	}
	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@ManyToOne
	@JoinColumn(name="educationHistory")
	public EducationalHistory getEducationalHistory() {
		return educationalHistory;
	}
	public void setEducationalHistory(EducationalHistory educationalHistory) {
		this.educationalHistory = educationalHistory;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	
	
	

}
