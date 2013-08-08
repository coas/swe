package cs.mum.dao;

import java.util.List;

public interface IUnivLevDataStructCourse {

	
	public void insert(UnivLevDataStructCourse univdDataStructCourse);
	
	public List<UnivLevDataStructCourse> getAllUnivdDataStructCourse();
	
	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id);
}
