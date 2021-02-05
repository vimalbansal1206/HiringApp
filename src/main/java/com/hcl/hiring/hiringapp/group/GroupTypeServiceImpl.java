package com.hcl.hiring.hiringapp.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupTypeServiceImpl implements GroupTypeService {
	
	@Autowired
	private GroupTypeRepo repo;
	
	@Override
	public List<GroupType> getAllGroupType() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void save(GroupType groupType) {
		repo.save(groupType);
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public GroupType update(Long id, GroupType groupType) {
		// TODO Auto-generated method stub
		return null;
	}

}
