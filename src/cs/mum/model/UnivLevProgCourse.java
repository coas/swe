package cs.mum.model;

public class UnivLevProgCourse {

	private long Id;
	private ProgramingLanguage programingLang;
	private String notOnlistProgramingLanguage;
	private String courseTitle;
	private int year;
	public UnivLevProgCourse(ProgramingLanguage programingLang,
			String notOnlistProgramingLanguage, String courseTitle, int year) {
		super();
		this.programingLang = programingLang;
		this.notOnlistProgramingLanguage = notOnlistProgramingLanguage;
		this.courseTitle = courseTitle;
		this.year = year;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public ProgramingLanguage getProgramingLang() {
		return programingLang;
	}
	public void setProgramingLang(ProgramingLanguage programingLang) {
		this.programingLang = programingLang;
	}
	public String getNotOnlistProgramingLanguage() {
		return notOnlistProgramingLanguage;
	}
	public void setNotOnlistProgramingLanguage(String notOnlistProgramingLanguage) {
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
	
	
	
	
}
