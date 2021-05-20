package com.jrosas.app.mongodb.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document("flights")
public class FlightInfo {
	@Id
	private @Getter @Setter String id;
	@Field("departure")
	@Indexed
	private @Getter @Setter String departureCity;
	@Field("destination")
	@Indexed
	private @Getter @Setter String destinationCity;
	private @Getter @Setter FlightType flightType;
	private @Getter @Setter boolean isDelay;
	private @Getter @Setter int durationMin;
	private @Getter @Setter LocalDate departureDate;
	private @Getter @Setter AirCraft aircraft;
	@Transient
	private @Getter @Setter LocalDate createdAt;
	
	public FlightInfo() {
		this.createdAt = LocalDate.now();
	}
	
	

}
