package cs.mum.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cs.mum.model.DataStructureCourse;
import cs.mum.model.User;

public class DataStructureCourseDAO implements IDataStructureCourseDAO {

	@Autowired
	private SessionFactory sf;

	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
	public void insert(DataStructureCourse dataStructureCourse) {
		sf.getCurrentSession().saveOrUpdate(dataStructureCourse);
	}
	
	
	public List<DataStructureCourse> getAllDataStructureCourse() {

		@SuppressWarnings("unchecked")
		List<DataStructureCourse> dataStractureCourse = sf.getCurrentSession()
				.createQuery("from DataStructureCourse").list();

		return dataStractureCourse;
	}
	
	
	public DataStructureCourse getDataStructureCourseById(long id) {
		DataStructureCourse dataStructureCourse = (DataStructureCourse) sf.getCurrentSession().get(
				User.class, id);
		return dataStructureCourse;

	}
	
	
}
