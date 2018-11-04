package main.java.match.job.bo;

import java.util.List;

import main.java.match.job.model.job.Job;

public interface IMatchJobBo {

	List<Job> findJobs(Integer workerId) throws Exception;
}
