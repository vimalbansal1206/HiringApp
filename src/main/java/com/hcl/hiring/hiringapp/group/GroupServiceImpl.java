package com.hcl.hiring.hiringapp.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	private GroupRepo repo;
	
	@Override
	public List<Group> getAllGroup() {
		return repo.findAll();
	}

	@Override
	public void save(Group group) {
		repo.save(group);
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Group update(Long id, Group groupType) {
		// TODO Auto-generated method stub
		return null;
	}

}
