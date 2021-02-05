package com.hcl.hiring.hiringapp.interviewer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewerRepo extends JpaRepository<Interviewer, Long> {

}
