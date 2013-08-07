package cs.mum.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Section {
	private long id;
	private boolean isComplete;
	private Application application;
	private Date cDate;
	
	public Section() {
	}

	public Section(boolean isComplete, Application application, Date cdate) {
		this.isComplete = isComplete;
		this.application = application;
		this.cDate=cdate;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	@ManyToOne
	@JoinColumn(name="applicationId")
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
    @Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	
	
}
