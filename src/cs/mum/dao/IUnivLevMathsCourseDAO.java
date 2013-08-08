package cs.mum.dao;

import java.util.List;

import cs.mum.model.UnivLevMathsCourse;

public interface IUnivLevMathsCourseDAO {

	public void insert(UnivLevMathsCourse univLevMathsCourse);
	
	public List<UnivLevMathsCourse> getAllUnivLevMathsCourse();
	
	public UnivLevMathsCourse getUnivLevMathsCourseById(long id);
}
