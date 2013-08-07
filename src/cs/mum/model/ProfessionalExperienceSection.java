package cs.mum.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProfessionalExperiencesection", schema = "coasdb")
public class ProfessionalExperienceSection extends Section{

	private ProgrammingLanguage progLangUsedMostInprofCarrer;
	private String notOnListprogLangUsedMostProfCarrer;
	private String programmingCarrerSummary;
	private int programmingCarrerYears;
	private int programmingCarrerMonths;
	private String universityLevelDataStructureCourseTitle;
	private String universityLevelMathCourseTitles;
	private List<IndividualWorkExperience> indivitualWorkExprience;
	private List<UnivLevMathsCourse> univLveMathsCourse;
	private List<UnivLevDataStructCourse> univLevDataStructuCourse;
	private List<UnivLevProgCourse> univLevProgCourse;
	private List<ProgrammingSkillLevel> programmingSkillLevels;

	public ProfessionalExperienceSection(
			String notOnListprogLangUsedMostProfCarrer,
			String programmingCarrerSummary, int programmingCarrerYears,
			int programmingCarrerMonths,
			String universityLevelDataStructureCourseTitle,
			String universityLevelMathCourseTitles,
			List<IndividualWorkExperience> indivitualWorkExprience,
			List<UnivLevMathsCourse> univLveMathsCourse,
			List<UnivLevDataStructCourse> univLevDataStructuCourse,
			List<UnivLevProgCourse> univLevProgCourse) {
		super();
		this.notOnListprogLangUsedMostProfCarrer = notOnListprogLangUsedMostProfCarrer;
		this.programmingCarrerSummary = programmingCarrerSummary;
		this.programmingCarrerYears = programmingCarrerYears;
		this.programmingCarrerMonths = programmingCarrerMonths;
		this.universityLevelDataStructureCourseTitle = universityLevelDataStructureCourseTitle;
		this.universityLevelMathCourseTitles = universityLevelMathCourseTitles;
		this.indivitualWorkExprience = indivitualWorkExprience;
		this.univLveMathsCourse = univLveMathsCourse;
		this.univLevDataStructuCourse = univLevDataStructuCourse;
		this.univLevProgCourse = univLevProgCourse;
	}

	@OneToMany(mappedBy = "professionalExperienceSection")
	public List<IndividualWorkExperience> getIndivitualWorkExprience() {
		return indivitualWorkExprience;
	}

	public void setIndivitualWorkExprience(
			List<IndividualWorkExperience> indivitualWorkExprience) {
		this.indivitualWorkExprience = indivitualWorkExprience;
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

	@OneToMany(mappedBy = "professionalExperienceSection")
	public List<UnivLevMathsCourse> getUnivLveMathsCourse() {
		return univLveMathsCourse;
	}

	public void setUnivLveMathsCourse(
			List<UnivLevMathsCourse> univLveMathsCourse) {
		this.univLveMathsCourse = univLveMathsCourse;
	}

	@OneToMany(mappedBy = "professionalExperinceSection")
	public List<UnivLevDataStructCourse> getUnivLevDataStructuCourse() {
		return univLevDataStructuCourse;
	}

	public void setUnivLevDataStructuCourse(
			List<UnivLevDataStructCourse> univLevDataStructuCourse) {
		this.univLevDataStructuCourse = univLevDataStructuCourse;
	}

	@OneToMany(mappedBy = "professionalExperinceSection")
	public List<UnivLevProgCourse> getUnivLevProgCourse() {
		return univLevProgCourse;
	}

	public void setUnivLevProgCourse(List<UnivLevProgCourse> univLevProgCourse) {
		this.univLevProgCourse = univLevProgCourse;
	}

	@ManyToOne
	@JoinColumn(name = "progLangUsedMostInprofCarrer")
	public ProgrammingLanguage getProgLangUsedMostInprofCarrer() {
		return progLangUsedMostInprofCarrer;
	}

	public void setProgLangUsedMostInprofCarrer(
			ProgrammingLanguage progLangUsedMostInprofCarrer) {
		this.progLangUsedMostInprofCarrer = progLangUsedMostInprofCarrer;
	}
	
	@OneToMany(mappedBy="professionalExperinceSection")
	public List<ProgrammingSkillLevel> getProgrammingSkillLevels() {
		return programmingSkillLevels;
	}

	public void setProgrammingSkillLevels(
			List<ProgrammingSkillLevel> programmingSkillLevels) {
		this.programmingSkillLevels = programmingSkillLevels;
	}

}
