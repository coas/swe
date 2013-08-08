package cs.mum.dao;

import java.util.List;

import cs.mum.model.Section;

public interface ISectionDAO {

	public void insert(Section section);
	
	public List<Section> getAllSection();
	
	public Section getSectionById(long id);
}
