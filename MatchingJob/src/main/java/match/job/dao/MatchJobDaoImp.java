package main.java.match.job.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import feign.Feign;
import main.java.match.job.model.job.Job;
import main.java.match.job.model.worker.Worker;

@Repository
public class MatchJobDaoImp extends AbstractMatchJobDao implements IMatchJobDao {

	@Override
	public List<Job> listJobs() {
		List<Job> res = Feign.builder().encoder(encoder).decoder(decoder).target(IJobAPI.class, TestURL.APIDomain).listJobs();
		return res;
	}

	@Override
	public List<Worker> listWorkers() {
		List<Worker> res = Feign.builder().encoder(encoder).decoder(decoder).target(IWorkerAPI.class, TestURL.APIDomain).listWorkers();
		return res;
	}

}
