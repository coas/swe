package cs.mum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table ( schema = "coasdb")
public class UnivLevMathsCourse {

	private int Id;
	private MathCourse mathCourse;
	
	
	
	public UnivLevMathsCourse(MathCourse mathCourse) {
		
		this.mathCourse = mathCourse;
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
	public MathCourse getMathCourse() {
		return mathCourse;
	}
	public void setMathCourse(MathCourse mathCourse) {
		this.mathCourse = mathCourse;
	}
	
	
}
