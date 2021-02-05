package com.hcl.hiring.hiringapp.interviewer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface InterviewerService {
	List<Interviewer> getAllInterviewer();
	
	void save(Interviewer interviewer );
	
	void delete(Long id);
	
	Interviewer update(Long id, Interviewer interviewer);
	
}
