package cs.mum.dao;

import java.util.List;

import cs.mum.model.UnivLevProgCourse;

public interface IUnivLevProgCourseDAO {

	
	public void insert(UnivLevProgCourse univLevProgCourse);
	
	public List<UnivLevProgCourse> getAllUnivLevProgCourse();
	
	public UnivLevProgCourse getUnivLevProgCourseById(long id);
}
