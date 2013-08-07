package cs.mum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Country {
	private long id;
	private String description;
	private Date cdate;
	private String status;
	private User cuser;
	
	
	public Country() {
		
	}
	public Country(String description, Date cdate, String status, User user) {
		this.description = description;
		this.cdate = cdate;
		this.status = status;
		this.cuser = user;
	}
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Temporal(TemporalType.DATE)
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@ManyToOne
	@JoinColumn(name="cuser")
	public User getCuser() {
		return cuser;
	}
	public void setCuser(User cuser) {
		this.cuser = cuser;
	}
}
