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
public class UnivLevMathsCourse {

	private int Id;
	private MathCourse mathCourse;
	private Date cDate;
	private ProfessionalExperienceSection professionalExperienceSection;

	public UnivLevMathsCourse(MathCourse mathCourse, Date cdate) {

		this.mathCourse = mathCourse;
		this.cDate = cdate;
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	@ManyToOne
	@JoinColumn(name="mathCourse")
	public MathCourse getMathCourse() {
		return mathCourse;
	}

	public void setMathCourse(MathCourse mathCourse) {
		this.mathCourse = mathCourse;
	}

	@ManyToOne
	@JoinColumn(name = "professionalExperienceSection")
	public ProfessionalExperienceSection getProfessionalExperienceSection() {
		return professionalExperienceSection;
	}

	public void setProfessionalExperienceSection(
			ProfessionalExperienceSection professionalExperienceSection) {
		this.professionalExperienceSection = professionalExperienceSection;
	}

	@Temporal(TemporalType.DATE)
	public Date getcDate() {
		return cDate;
	}

	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
}
