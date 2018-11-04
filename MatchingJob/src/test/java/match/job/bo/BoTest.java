package test.java.match.job.bo;

import static org.testng.Assert.assertNotNull;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import main.java.match.job.app.App;
import main.java.match.job.bo.IMatchJobBo;
import main.java.match.job.model.job.Job;

@SpringBootTest(classes = {App.class})
public class BoTest extends AbstractTestNGSpringContextTests {

	@Autowired
	IMatchJobBo bo;
	
	@Test
	public void testBo() throws Exception {
		Future<List<Job>> jobs = bo.findJobs(0);
		assertNotNull(jobs.get());
	}
}
