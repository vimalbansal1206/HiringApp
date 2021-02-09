package com.hcl.hiring.hiringapp.group;

import java.util.List;

public interface GroupService {
	
	List<Group> getAllGroup();
	
	void save(GroupDTO Group );
	
	void delete(Long id);
	
	Group update(Long id, Group groupType);
}
