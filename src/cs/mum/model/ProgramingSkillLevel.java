package cs.mum.model;

public class ProgramingSkillLevel {

	private long Id;
	private ProgrammingLanguage programingLanguage;
	private ProgLangExperienceValue knowdlageLevel;
	public ProgramingSkillLevel(ProgrammingLanguage programingLanguage,
			ProgLangExperienceValue knowdlageLevel) {
		this.programingLanguage = programingLanguage;
		this.knowdlageLevel = knowdlageLevel;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public ProgrammingLanguage getProgramingLanguage() {
		return programingLanguage;
	}
	public void setProgramingLanguage(ProgrammingLanguage programingLanguage) {
		this.programingLanguage = programingLanguage;
	}
	public ProgLangExperienceValue getKnowdlageLevel() {
		return knowdlageLevel;
	}
	public void setKnowdlageLevel(ProgLangExperienceValue knowdlageLevel) {
		this.knowdlageLevel = knowdlageLevel;
	}
	
	
	
	
}
