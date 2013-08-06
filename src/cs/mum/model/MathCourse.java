package cs.mum.model;

import java.util.Date;

public class MathCourse {

	private int Id;
	private String description;
	private Date cDate;
	private User cUser;
	private String Status;
	
	
	
	public MathCourse(String description, Date cDate, User cUser, String status) {
		super();
		this.description = description;
		this.cDate = cDate;
		this.cUser = cUser;
		Status = status;
	}
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
