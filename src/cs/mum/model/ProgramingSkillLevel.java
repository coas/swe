package cs.mum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table ( schema = "coasdb")
public class ProgramingSkillLevel {

	private long Id;
	private ProgrammingLanguage programingLanguage;
	private ProgramingExprienceValue knowdlageLevel;
	
	
	public ProgramingSkillLevel(ProgramingLanguage programingLanguage,
			ProgramingExprienceValue knowdlageLevel) {
		super();
		this.programingLanguage = programingLanguage;
		this.knowdlageLevel = knowdlageLevel;
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
	
	@OneToMany(mappedBy="ProgramingSkillLevel")
	public ProgrammingLanguage getProgramingLanguage() {
		return programingLanguage;
	}
	public void setProgramingLanguage(ProgramingLanguage programingLanguage) {
		this.programingLanguage = programingLanguage;
	}
	
	@OneToMany(mappedBy="ProgramingSkillLevel")
	public ProgramingExprienceValue getKnowdlageLevel() {
		return knowdlageLevel;
	}
	public void setKnowdlageLevel(ProgramingExprienceValue knowdlageLevel) {
		this.knowdlageLevel = knowdlageLevel;
	}
	
	
	
	
}
