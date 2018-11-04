package main.java.match.job.dao;

import java.util.List;

import feign.RequestLine;
import main.java.match.job.model.job.Job;

public interface IJobAPI {

	@RequestLine("GET /api/jobs")
	List<Job> listJobs();
}
