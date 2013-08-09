package cs.mum.dao;

import java.util.List;

public interface IUnivLevDataStructCourseDAO {

	
	public void insert(UnivLevDataStructCourse univDataStructCourse);
	
	public List<UnivLevDataStructCourse> getAllUnivDataStructCourse();
	
	public UnivLevDataStructCourse getUnivLevDataStructCourseById(long id);
}
