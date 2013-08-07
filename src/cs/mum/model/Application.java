package cs.mum.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Application {
	private long id;
	private String status;
	private String evaluationComment;
	private User evaluatedBy;
	private User applicant;
	private Date cdate;
	private List<Section> listSection; 
	
	
	
	public Application() {
	}

	public Application(String status, String evaluationComment,
			User evaluatedBy, User applicant, Date cdate,
			List<Section> listSection) {
		this.status = status;
		this.evaluationComment = evaluationComment;
		this.evaluatedBy = evaluatedBy;
		this.applicant = applicant;
		this.cdate = cdate;
		this.listSection = listSection;
	}


	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEvaluationComment() {
		return evaluationComment;
	}

	public void setEvaluationComment(String evaluationComment) {
		this.evaluationComment = evaluationComment;
	}
	@ManyToOne
	@JoinColumn(name="eveluatedBy")
	public User getEvaluatedBy() {
		return evaluatedBy;
	}

	public void setEvaluatedBy(User evaluatedBy) {
		this.evaluatedBy = evaluatedBy;
	}
	@Temporal(TemporalType.DATE)
	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	@OneToMany(mappedBy="application")
	public List<Section> getListSection() {
		return listSection;
	}

	public void setListSection(List<Section> listSection) {
		this.listSection = listSection;
	}
	@OneToOne
	@JoinColumn(name="applicantId")
	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}
}
