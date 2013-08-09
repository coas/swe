package cs.mum.dao;

import java.util.List;

import cs.mum.model.UnivLevDataStructCourse;

public interface IUnivLevDataStructCourseDAO {

	public void insert(UnivLevDataStructCourse univLevDataStructCourse);
	
	public List<UnivLevDataStructCourse> getAllUnivLevDataStructCourse();
	
	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id);
}
