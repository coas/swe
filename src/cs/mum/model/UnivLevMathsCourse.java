package cs.mum.model;

public class UnivLevMathsCourse {

	private int Id;
	private MathCourse mathCourse;
	
	
	
	public UnivLevMathsCourse(MathCourse mathCourse) {
		
		this.mathCourse = mathCourse;
	}
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
