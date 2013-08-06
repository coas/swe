package cs.mum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "ProfessionalExperiencesection", schema = "coasdb")
public class ProfessionalExperienceSection {

	private long Id;
	
	private String notOnListprogLangUsedMostProfCarrer;
	private String programmingCarrerSummary;
	private int programmingCarrerYears;
	private int programmingCarrerMonths;
	private String universityLevelDataStructureCourseTitle;
	private String universityLevelMathCourseTitles;
	
	
	public ProfessionalExperienceSection(
			ProgrammingLanguage progLangUsedMostProfCarrer,
			String notOnListprogLangUsedMostProfCarrer,
			String programmingCarrerSummary, int programmingCarrerYears,
			int programmingCarrerMonths,
			String universityLevelDataStructureCourseTitle,
			String universityLevelMathCourseTitles) {
		
		
		this.notOnListprogLangUsedMostProfCarrer = notOnListprogLangUsedMostProfCarrer;
		this.programmingCarrerSummary = programmingCarrerSummary;
		this.programmingCarrerYears = programmingCarrerYears;
		this.programmingCarrerMonths = programmingCarrerMonths;
		this.universityLevelDataStructureCourseTitle = universityLevelDataStructureCourseTitle;
		this.universityLevelMathCourseTitles = universityLevelMathCourseTitles;
	}

	@Id
	@GeneratedValue
	@Column (name ="id")
	public long getId() {
		return Id;
	}


	


	public String getNotOnListprogLangUsedMostProfCarrer() {
		return notOnListprogLangUsedMostProfCarrer;
	}


	public void setNotOnListprogLangUsedMostProfCarrer(
			String notOnListprogLangUsedMostProfCarrer) {
		this.notOnListprogLangUsedMostProfCarrer = notOnListprogLangUsedMostProfCarrer;
	}


	public String getProgrammingCarrerSummary() {
		return programmingCarrerSummary;
	}


	public void setProgrammingCarrerSummary(String programmingCarrerSummary) {
		this.programmingCarrerSummary = programmingCarrerSummary;
	}


	public int getProgrammingCarrerYears() {
		return programmingCarrerYears;
	}


	public void setProgrammingCarrerYears(int programmingCarrerYears) {
		this.programmingCarrerYears = programmingCarrerYears;
	}


	public int getProgrammingCarrerMonths() {
		return programmingCarrerMonths;
	}


	public void setProgrammingCarrerMonths(int programmingCarrerMonths) {
		this.programmingCarrerMonths = programmingCarrerMonths;
	}


	public String getUniversityLevelDataStructureCourseTitle() {
		return universityLevelDataStructureCourseTitle;
	}


	public void setUniversityLevelDataStructureCourseTitle(
			String universityLevelDataStructureCourseTitle) {
		this.universityLevelDataStructureCourseTitle = universityLevelDataStructureCourseTitle;
	}


	public String getUniversityLevelMathCourseTitles() {
		return universityLevelMathCourseTitles;
	}


	public void setUniversityLevelMathCourseTitles(
			String universityLevelMathCourseTitles) {
		this.universityLevelMathCourseTitles = universityLevelMathCourseTitles;
	}
	
	
}
