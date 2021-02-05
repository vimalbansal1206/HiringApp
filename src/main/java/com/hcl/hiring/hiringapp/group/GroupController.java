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
@RequestMapping("/api/group")
public class GroupController {

	@Autowired
	private GroupService groupService;
	
	@GetMapping("/allGroup")
	public List<Group> getAllGroupTypes() {
		List<Group> lst = groupService.getAllGroup();
		return lst;
	}
	
	@PostMapping("/group")
	public void createGroup(@RequestBody Group group) {
		groupService.save(group);
	}
	
	@DeleteMapping("/group/{id}")
	public void deleteInterviewer(@PathVariable Long id) {
		groupService.delete(id);
	}
	
	@PutMapping("/group/{id}")
	public ResponseEntity<Group> updateInterviewer(@PathVariable Long id, @RequestBody Group group) {
		return ResponseEntity.ok(groupService.update(id, group));
	}

}
