package com.jrosas.app.mongodb.domain;

import lombok.Getter;
import lombok.Setter;

public class AirCraft {
private  @Getter @Setter String model;
private @Getter @Setter int seats;

public AirCraft(String model, int seats) {
	this.model = model;
	this.seats = seats;
}

}
