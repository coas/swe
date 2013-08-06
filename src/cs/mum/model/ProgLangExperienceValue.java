package cs.mum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (schema = "coasdb")
public class ProgLangExperienceValue {

	private long Id;
	private String description;
	
	
	
	public ProgLangExperienceValue(String description) {
		
		this.description = description;
	}


	@Id
	@GeneratedValue
	@Column (name ="id")
	public long getId() {
		return Id;
	}



	/*public void setId(long id) {
		Id = id;
	}*/



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
