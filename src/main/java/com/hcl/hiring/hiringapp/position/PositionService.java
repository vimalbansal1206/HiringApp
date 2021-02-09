package com.hcl.hiring.hiringapp.position;

import java.util.List;

public interface PositionService {

	List<Position> getAllPositions();
	
	void save(Position position );
	
	void delete(Long id);
	
	Position update(Long id, Position position);
}
