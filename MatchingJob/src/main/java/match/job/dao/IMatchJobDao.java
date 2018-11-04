package main.java.match.job.dao;

import java.util.List;

import main.java.match.job.model.job.Job;
import main.java.match.job.model.worker.Worker;

public interface IMatchJobDao {

	List<Job> listJobs();
	List<Worker> listWorkers();
}
