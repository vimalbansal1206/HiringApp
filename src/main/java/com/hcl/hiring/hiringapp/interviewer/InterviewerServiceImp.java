package com.hcl.hiring.hiringapp.interviewer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewerServiceImp implements InterviewerService{
	
	@Autowired
	private InterviewerRepo repo;
	
	@Override
	public List<Interviewer> getAllInterviewer() {
		return repo.findAll();
	}

	@Override
	public void save(Interviewer interviewer) {
		repo.save(interviewer);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Interviewer update(Long id, Interviewer interviewer) {
		
		Interviewer intvw = repo.findById(id)
				.orElseThrow(() -> new RuntimeException("Interviewer not exist with id :" + id));
		
		intvw.setEmail(interviewer.getEmail());
		intvw.setName(interviewer.getName());
		intvw.setTpLevel(interviewer.getTpLevel());
		Interviewer updatedIntvw = repo.save(intvw);
		
		return updatedIntvw;
	}
}
