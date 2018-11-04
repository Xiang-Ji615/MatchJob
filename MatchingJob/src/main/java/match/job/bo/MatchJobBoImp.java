package main.java.match.job.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.expression.AccessException;
import org.springframework.stereotype.Service;

import main.java.match.job.model.job.Job;
import main.java.match.job.model.worker.Worker;

@Service
public class MatchJobBoImp extends AbstractMatchJobBo implements IMatchJobBo {

	private Worker worker;

	@Override
	public List<Job> findJobs(Integer workerId) throws Exception {
		List<Worker> workers = dao.listWorkers();
		Worker worker = workers.stream().filter(w -> w.getUserId() == workerId).findFirst().orElse(null);
		if (null == worker) {
			throw new AccessException("Worker not found!");
		}
		return findTop3Jobs(worker);
	}

	private List<Job> findTop3Jobs(Worker worker) {
		this.worker = worker;
		List<Job> allJobs = dao.listJobs();
		if (!worker.getHasDriversLicense())
			allJobs = allJobs.stream().filter(job -> job.getDriverLicenseRequired() == false)
					.collect(Collectors.toList());
		allJobs = allJobs.stream().filter(job -> worker.getCertificates().containsAll(job.getRequiredCertificates())).collect(Collectors.toList());
	
		List<Comparator<Job>> comps = new ArrayList<>();
		comps.add(locationComparator);
		comps.add(billRateComparator);
		comps.add(startDateComparator);
		Collections.sort(allJobs, new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				for(Comparator<Job> comp : comps) {
					if(comp.compare(o1, o2) < 0)
						return -1;
					else if(comp.compare(o1, o2) > 0)
						return 1;
					}
						return 0;
					}
		});
			
		return allJobs.size() > 3?allJobs.subList(0, 3):allJobs;
	}

	private Comparator<Job> locationComparator = new Comparator<Job>() {

		@Override
		public int compare(Job o1, Job o2) {
			Double distance = Math.pow(Double.valueOf(o1.getLocation().getLatitude()) - Double.valueOf(worker.getJobSearchAddress().getLatitude()), 2) + 
				   Math.pow(Double.valueOf(o1.getLocation().getLongitude()) - Double.valueOf(worker.getJobSearchAddress().getLongitude()), 2)-
				   Math.pow(Double.valueOf(o2.getLocation().getLatitude()) - Double.valueOf(worker.getJobSearchAddress().getLatitude()), 2) -
				   Math.pow(Double.valueOf(o2.getLocation().getLongitude()) - Double.valueOf(worker.getJobSearchAddress().getLongitude()), 2);
			if(distance > 0)
				return 1;
			else if(distance < 0)
				return -1;
			else 
				return 0;
		}
	};
	
	private Comparator<Job> billRateComparator = new Comparator<Job>() {

		@Override
		public int compare(Job o1, Job o2) {
			Double diff =  Double.valueOf(o1.getBillRate()) - Double.valueOf(o2.getBillRate());
			if(diff > 0)
				return 1;
			else if(diff < 0)
				return -1;
			else
				return 0;
		}
	};
	
	private Comparator<Job> startDateComparator = new Comparator<Job>() {

		@Override
		public int compare(Job o1, Job o2) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date job1Date = null;
			try {
				job1Date = sdf.parse(o1.getStartDate());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			Date job2Date = null;
			try {
				job2Date = sdf.parse(o2.getStartDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return job1Date.compareTo(job2Date);
		}
		
		
	};
}
