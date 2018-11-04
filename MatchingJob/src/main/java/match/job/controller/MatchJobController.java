package main.java.match.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.match.job.bo.IMatchJobBo;
import main.java.match.job.model.job.Job;

@RestController
@RequestMapping("Rest/V1")
public class MatchJobController {
	
	@Autowired
	IMatchJobBo bo;

	@RequestMapping(value = "FindJobs/{workerId}", method = RequestMethod.GET)
	public ResponseEntity findJobs(@PathVariable(value="workerId") Integer workerId) throws Exception{
		try{
			List<Job> jobs = bo.findJobs(workerId);
			return ResponseEntity.ok(jobs);
		}catch(Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
