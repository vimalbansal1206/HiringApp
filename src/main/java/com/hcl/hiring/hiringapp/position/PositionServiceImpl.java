package com.hcl.hiring.hiringapp.position;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	private PositionRepo repo;
	
	@Override
	public List<Position> getAllPositions() {
		return repo.findAll();
	}

	@Override
	public void save(Position position) {
		repo.save(position);

	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);

	}

	@Override
	public Position update(Long id, Position position) {
		// TODO Auto-generated method stub
				return null;
	}

}
