package com.hcl.hiring.hiringapp.position;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/position")
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	@GetMapping("/allPosition")
	public List<Position> getAllPosition() {
		List<Position> lst = positionService.getAllPositions();
		return lst;
	}
	
	@PostMapping("/position")
	public void createPosition(@RequestBody Position position) {
		positionService.save(position);
	}
	
	@DeleteMapping("/position/{id}")
	public void deletePosition(@PathVariable Long id) {
		positionService.delete(id);
	}
	
	@PutMapping("/position/{id}")
	public ResponseEntity<Position> updatePosition(@PathVariable Long id, @RequestBody Position position) {
		return ResponseEntity.ok(positionService.update(id, position));
	}

}
