package main.java.match.job.dao;

import java.util.List;

import feign.RequestLine;
import main.java.match.job.model.worker.Worker;

public interface IWorkerAPI {

	@RequestLine("GET /api/workers")
	List<Worker> listWorkers();
}
