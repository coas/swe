package cs.mum.model;

public class UnivLevDataStructCourse {

	private int Id;
	private DataStructureCourse dataStructureCourse;
	private DataStructureValue dataStructureValue;
	
	
	
	
	public UnivLevDataStructCourse(DataStructureCourse dataStructureCourse,
			DataStructureValue dataStructureValue) {
		super();
		this.dataStructureCourse = dataStructureCourse;
		this.dataStructureValue = dataStructureValue;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public DataStructureCourse getDataStructureCourse() {
		return dataStructureCourse;
	}
	public void setDataStructureCourse(DataStructureCourse dataStructureCourse) {
		this.dataStructureCourse = dataStructureCourse;
	}
	public DataStructureValue getDataStructureValue() {
		return dataStructureValue;
	}
	public void setDataStructureValue(DataStructureValue dataStructureValue) {
		this.dataStructureValue = dataStructureValue;
	}
	
	
	
}
