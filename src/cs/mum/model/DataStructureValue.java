package cs.mum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name = "DatastractureValue", schema = "coasdb")
public class DataStructureValue {

	private int Id;
	private String description;
	private Date cDate;
	private User cUser;
	private String Status;
	
	public DataStructureValue(String description, Date cDate, User cUser,
			String status) {
		super();
		this.description = description;
		this.cDate = cDate;
		this.cUser = cUser;
		Status = status;
	}
	
	@Id
	@GeneratedValue
	@Column (name ="id")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	@ManyToOne
	@JoinColumn(name="cuser")
	public User getcUser() {
		return cUser;
	}
	public void setcUser(User cUser) {
		this.cUser = cUser;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
	
}
