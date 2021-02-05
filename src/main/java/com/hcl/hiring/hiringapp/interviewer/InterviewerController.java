package com.hcl.hiring.hiringapp.interviewer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/interviewer")
public class InterviewerController {
	
	@Autowired
	InterviewerService interviewerService;
	
	@GetMapping("/allIneterviewer")
	public List<Interviewer> getAllInterViewers() {
		
		List<Interviewer> lst = interviewerService.getAllInterviewer();
		System.out.println("-------------------------" + lst);
		return lst;
	}
	
	@PostMapping("/interviewer")
	public void createInterviewer(@RequestBody Interviewer interviewer) {
		System.out.println("-------------------------" + interviewer.getName());
		System.out.println("-------------------------" + interviewer.getEmail());
		System.out.println("-------------------------" + interviewer.getTpLevel());
		interviewerService.save(interviewer);
	}
	
	@DeleteMapping("/interviewer/{id}")
	public void deleteInterviewer(@PathVariable Long id) {
		System.out.println("-------------------------" + id);
		interviewerService.delete(id);
	}
	
	@PutMapping("/interviewer/{id}")
	public ResponseEntity<Interviewer> updateInterviewer(@PathVariable Long id, @RequestBody Interviewer interviewer) {
		return ResponseEntity.ok(interviewerService.update(id, interviewer));
	}
}
