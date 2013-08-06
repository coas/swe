package cs.mum.model;

public class IndividualWorkExperience {

	private int id;
	private ProgramingLanguage programingLang ;
	private String notOnListProgramingLang;
	private int duration;
	private int year;
	private String projectDescription;
	
	
	
	
	public IndividualWorkExperience(ProgramingLanguage programingLang,
			String notOnListProgramingLang, int duration, int year,
			String projectDescription) {
		super();
		this.programingLang = programingLang;
		this.notOnListProgramingLang = notOnListProgramingLang;
		this.duration = duration;
		this.year = year;
		this.projectDescription = projectDescription;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProgramingLanguage getProgramingLang() {
		return programingLang;
	}
	public void setProgramingLang(ProgramingLanguage programingLang) {
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
