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
@Table ( schema = "coasdb")
public class ProgrammingSkillLevel {

	private long Id;
	private ProgrammingLanguage programingLanguage;
	private ProgLangExperienceValue knowledgeLevel;
	private ProfessionalExperienceSection professionalExperinceSection;
	private ProgLangExperienceValue progLangExperienceValue;
	private Date cDate;
	
	
	
	public ProgrammingSkillLevel() {
	}
	public ProgrammingSkillLevel(ProgrammingLanguage programingLanguage,
			ProgLangExperienceValue knowledgeLevel,
			ProfessionalExperienceSection professionalExperinceSection,
			Date cDate) {
		this.programingLanguage = programingLanguage;
		this.knowledgeLevel = knowledgeLevel;
		this.professionalExperinceSection = professionalExperinceSection;
		this.cDate = cDate;
	}
	@Id
	@GeneratedValue
	@Column (name ="id")
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="programingLanguage")
	public ProgrammingLanguage getProgramingLanguage() {
		return programingLanguage;
	}
	public void setProgramingLanguage(ProgrammingLanguage programingLanguage) {
		this.programingLanguage = programingLanguage;
	}
	@ManyToOne
	@JoinColumn(name="knowledgeLevel")
	public ProgLangExperienceValue getKnowledgeLevel() {
		return knowledgeLevel;
	}
	public void setKnowledgeLevel(ProgLangExperienceValue knowledgeLevel) {
		this.knowledgeLevel = knowledgeLevel;
	}
	@ManyToOne
	@JoinColumn(name="professionalExperinceSection")
	public ProfessionalExperienceSection getProfessionalExperinceSection() {
		return professionalExperinceSection;
	}

	public void setProfessionalExperinceSection(
			ProfessionalExperienceSection professionalExperinceSection) {
		this.professionalExperinceSection = professionalExperinceSection;
	}
	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	@ManyToOne
	@JoinColumn(name="progLangExperienceValue")
	public ProgLangExperienceValue getProgLangExperienceValue() {
		return progLangExperienceValue;
	}
	public void setProgLangExperienceValue(
			ProgLangExperienceValue progLangExperienceValue) {
		this.progLangExperienceValue = progLangExperienceValue;
	}
	
}
