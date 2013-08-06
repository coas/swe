package cs.mum.model;

public class ProgramingSkillLevel {

	private long Id;
	private ProgramingLanguage programingLanguage;
	private ProgramingExprienceValue knowdlageLevel;
	public ProgramingSkillLevel(ProgramingLanguage programingLanguage,
			ProgramingExprienceValue knowdlageLevel) {
		super();
		this.programingLanguage = programingLanguage;
		this.knowdlageLevel = knowdlageLevel;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public ProgramingLanguage getProgramingLanguage() {
		return programingLanguage;
	}
	public void setProgramingLanguage(ProgramingLanguage programingLanguage) {
		this.programingLanguage = programingLanguage;
	}
	public ProgramingExprienceValue getKnowdlageLevel() {
		return knowdlageLevel;
	}
	public void setKnowdlageLevel(ProgramingExprienceValue knowdlageLevel) {
		this.knowdlageLevel = knowdlageLevel;
	}
	
	
	
	
}
