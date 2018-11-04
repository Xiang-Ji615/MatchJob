package main.java.match.job.bo;

import java.util.List;
import java.util.concurrent.Future;

import main.java.match.job.model.job.Job;

public interface IMatchJobBo {

	Future<List<Job>> findJobs(Integer workerId) throws Exception;
}
