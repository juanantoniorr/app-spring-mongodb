package com.jrosas.app.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.jrosas.app.mongodb.domain.FlightInfo;

@Component
public class ApplicationRunner implements CommandLineRunner {
	
	private MongoTemplate mongoTemplate;
	
	public ApplicationRunner(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		FlightInfo emptyFlight = new FlightInfo();
		this.mongoTemplate.save(emptyFlight);
		System.out.println("Application started");
		
	}

}
