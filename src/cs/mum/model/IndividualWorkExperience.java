package cs.mum.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cs.mum.model.ProgrammingLanguage;

@Entity
@Table(name = "IndivitualworkExprience", schema = "coasdb")
public class IndividualWorkExperience {

	private int id;
	private ProgrammingLanguage programingLang;
	private String notOnListProgramingLang;
	private int duration;
	private int year;
	private Date cDate;
	private String projectDescription;
	private ProfessionalExperienceSection professionalExperienceSection;

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
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="programingLang")
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

	@ManyToOne
	@JoinColumn(name = "professionalExperienceSection")
	public ProfessionalExperienceSection getProfessionalExperienceSection() {
		return professionalExperienceSection;
	}

	public void setProfessionalExperienceSection(
			ProfessionalExperienceSection professionalExperienceSection) {
		this.professionalExperienceSection = professionalExperienceSection;
	}

	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

}
