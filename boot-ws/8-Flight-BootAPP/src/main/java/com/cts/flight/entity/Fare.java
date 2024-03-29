package com.cts.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fare {
	
	@Id
	@GeneratedValue
	private long fareId;
	private String currency;
	private double fare;
	public long getFareId() {
		return fareId;
	}
	public void setFareId(long fareId) {
		this.fareId = fareId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	

}
