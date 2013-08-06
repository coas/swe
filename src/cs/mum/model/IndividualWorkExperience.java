package cs.mum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cs.mum.model.ProgrammingLanguage;

@Entity
@Table (name = "IndivitualworkExprience", schema = "coasdb")
public class IndividualWorkExperience {

	private int id;
	private ProgrammingLanguage programingLang ;
	private String notOnListProgramingLang;
	private int duration;
	private int year;
	private String projectDescription;
	
	
	
	
	public IndividualWorkExperience(ProgrammingLanguage programingLang,
			String notOnListProgramingLang, int duration, int year,
			String projectDescription) {
		super();
		this.programingLang = programingLang;
		this.notOnListProgramingLang = notOnListProgramingLang;
		this.duration = duration;
		this.year = year;
		this.projectDescription = projectDescription;
	}
	
	@Id
	@GeneratedValue
	@Column (name ="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@OneToOne(mappedBy="IndivitualworkExprience")
	public ProgrammingLanguage getProgramingLang() {
		return programingLang;
	}
	public void setProgramingLang(ProgrammingLanguage programingLang) {
		this.programingLang = programingLang;
	}
	public String getNotOnListProgramingLang() {
		return notOnListProgramingLang;
	}
	public void setNotOnListProgramingLang(String notOnListProgramingLang) {
		this.notOnListProgramingLang = notOnListProgramingLang;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	
}
