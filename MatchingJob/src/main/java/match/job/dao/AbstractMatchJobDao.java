package main.java.match.job.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

@Component
public abstract class AbstractMatchJobDao {

	@Autowired
	GsonEncoder encoder;
	
	@Autowired
	GsonDecoder decoder;
	
	
}
