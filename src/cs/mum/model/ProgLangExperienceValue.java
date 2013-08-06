package cs.mum.model;

public class ProgLangExperienceValue {

	private long Id;
	private String description;
	
	
	
	public ProgLangExperienceValue(String description) {
		super();
		this.description = description;
	}



	public long getId() {
		return Id;
	}



	public void setId(long id) {
		Id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
