package com.hcl.hiring.hiringapp.group;

import java.util.List;

public interface GroupTypeService {

	List<GroupType> getAllGroupType();
	
	void save(GroupType groupType );
	
	void delete(Long id);
	
	GroupType update(Long id, GroupType groupType);
	

}
