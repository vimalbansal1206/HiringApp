package com.hcl.hiring.hiringapp.group;

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
@RequestMapping("/api/groupType")
public class GroupTypeController {

	@Autowired
	private GroupTypeService groupTypeService;
	
	@GetMapping("/allGroupTypes")
	public List<GroupType> getAllGroupTypes() {
		List<GroupType> lst = groupTypeService.getAllGroupType();
		System.out.println("-------------------------" + lst);
		return lst;
	}
	
	@PostMapping("/groupType")
	public void createInterviewer(@RequestBody GroupType groupType) {
		groupTypeService.save(groupType);
	}
	
	@DeleteMapping("/groupType/{id}")
	public void deleteInterviewer(@PathVariable Long id) {
		groupTypeService.delete(id);
	}
	
	@PutMapping("/groupType/{id}")
	public ResponseEntity<GroupType> updateInterviewer(@PathVariable Long id, @RequestBody GroupType groupType) {
		return ResponseEntity.ok(groupTypeService.update(id, groupType));
	}

}
