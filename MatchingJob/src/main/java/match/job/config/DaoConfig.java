package main.java.match.job.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

@Configuration
public class DaoConfig {

	@Bean
	public GsonEncoder getGsonEncoder() {
		return new GsonEncoder();
	}
	
	@Bean
	public GsonDecoder getGsonDecoder() {
		return new GsonDecoder();
	}
}
