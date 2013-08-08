package cs.mum.dao;

import java.util.List;

import cs.mum.model.MathCourse;

public interface IMathCourseDAO {

	public void insert(MathCourse mathCourse);
	
	public List<MathCourse> getAllMathCourse();
	
	public MathCourse getMathCourseById(long id);
}
