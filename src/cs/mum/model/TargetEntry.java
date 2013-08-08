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
public class TargetEntry {
	private long id;
	private String description;
	//status - 0 inactive, 1 active
	private boolean status;
	private Date cDate;
	private User cuser;
	
	public TargetEntry() {
	}

	public TargetEntry(String description, boolean status, Date cDate,
			User cuser) {
		this.description = description;
		this.status = status;
		this.cDate = cDate;
		this.cuser = cuser;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
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
