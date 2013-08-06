package cs.mum.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import cs.mum.model.User;


@Entity
@Table ( schema = "coasdb")
public class ProgrammingLanguage {

	private int Id;
	private String discription; 
	private Date cDate;
	private User cUser;
	private String status;
	
	
	
	
	public ProgrammingLanguage(String discription, Date cDate, User cUser,
			String status) {
		
		this.discription = discription;
		this.cDate = cDate;
		this.cUser = cUser;
		this.status = status;
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
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
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
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
