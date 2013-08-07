package cs.mum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "coasdb")
public class UnivLevProgCourse {

	private long Id;
	private ProgrammingLanguage programingLang;
	private String notOnlistProgramingLanguage;
	private String courseTitle;
	private int year;
	private Date cDate;
	private ProfessionalExperienceSection professionalExperinceSection;

	public UnivLevProgCourse(ProgrammingLanguage programingLang,
			String notOnlistProgramingLanguage, String courseTitle, int year,
			Date cDate,
			ProfessionalExperienceSection professionalExperienceSection) {
		this.programingLang = programingLang;
		this.notOnlistProgramingLanguage = notOnlistProgramingLanguage;
		this.courseTitle = courseTitle;
		this.year = year;
		this.cDate = cDate;
		this.professionalExperinceSection = professionalExperienceSection;
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="programingLang")
	public ProgrammingLanguage getProgramingLang() {
		return programingLang;
	}

	public void setProgramingLang(ProgrammingLanguage programingLang) {
		this.programingLang = programingLang;
	}

	public String getNotOnlistProgramingLanguage() {
		return notOnlistProgramingLanguage;
	}

	public void setNotOnlistProgramingLanguage(
			String notOnlistProgramingLanguage) {
		this.notOnlistProgramingLanguage = notOnlistProgramingLanguage;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	
	@ManyToOne
	@JoinColumn(name="professionalExperienceSection")
	public ProfessionalExperienceSection getProfessionalExperinceSection() {
		return professionalExperinceSection;
	}

	public void setProfessionalExperinceSection(
			ProfessionalExperienceSection professionalExperienceSection) {
		this.professionalExperinceSection = professionalExperienceSection;
	}

}
