package test.java.match.job.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import main.java.match.job.app.App;
import main.java.match.job.dao.IMatchJobDao;
import main.java.match.job.model.job.Job;
import main.java.match.job.model.worker.Worker;

@SpringBootTest(classes = {App.class})
public class DaoTest extends AbstractTestNGSpringContextTests{

	@Autowired
	IMatchJobDao dao;
	
	@Test
	public void testListJobs() {
		List<Job> jobs = dao.listJobs();
		assertNotNull(jobs);
	}
	
	@Test
	public void testListWorkers() {
		List<Worker> workers = dao.listWorkers();
		assertNotNull(workers);
	}
}
