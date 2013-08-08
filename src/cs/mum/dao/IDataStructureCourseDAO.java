package cs.mum.dao;

import java.util.List;

import cs.mum.model.DataStructureCourse;

public interface IDataStructureCourseDAO {
    
	public List<DataStructureCourse> getAllDataStructureCourse();
	
	public DataStructureCourse getDataStructureCourseById(long id);
	
	public void insert(DataStructureCourse dataStructureCourse);
}
