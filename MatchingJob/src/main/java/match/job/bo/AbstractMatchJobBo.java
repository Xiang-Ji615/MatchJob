package main.java.match.job.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.match.job.dao.IMatchJobDao;

@Service
public abstract class AbstractMatchJobBo {

	@Autowired
	IMatchJobDao dao;
}
