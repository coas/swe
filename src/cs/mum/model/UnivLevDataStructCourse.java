package cs.mum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "coasdb")
public class UnivLevDataStructCourse {

	private int Id;
	private DataStructureCourse dataStructureCourse;
	private DataStructureValue dataStructureValue;
	private ProfessionalExperienceSection professionalExperinceSection;
	private Date cDate;

	public UnivLevDataStructCourse(DataStructureCourse dataStructureCourse,
			DataStructureValue dataStructureValue, Date cdate) {
		super();
		this.dataStructureCourse = dataStructureCourse;
		this.dataStructureValue = dataStructureValue;
		this.cDate = cdate;
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return Id;
	}

	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}

	public void setId(int id) {
		Id = id;
	}

	@ManyToOne
	@JoinColumn(name = "dataStructureCourse")
	public DataStructureCourse getDataStructureCourse() {
		return dataStructureCourse;
	}

	public void setDataStructureCourse(DataStructureCourse dataStructureCourse) {
		this.dataStructureCourse = dataStructureCourse;
	}

	@ManyToOne
	@JoinColumn(name = "dataStructureValue")
	public DataStructureValue getDataStructureValue() {
		return dataStructureValue;
	}

	public void setDataStructureValue(DataStructureValue dataStructureValue) {
		this.dataStructureValue = dataStructureValue;
	}

	@ManyToOne
	@JoinColumn(name = "professionalExperinceSection")
	public ProfessionalExperienceSection getProfessionalExperinceSection() {
		return professionalExperinceSection;
	}

	public void setProfessionalExperinceSection(
			ProfessionalExperienceSection professionalExperinceSection) {
		this.professionalExperinceSection = professionalExperinceSection;
	}

}
