package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="distance_calculator")
public class DistanceCalculation implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int distance_Id;
	private String source ;
	private String destination;
	private double dist_in_km;
	private double dist_in_miles;
	public int getDistance_Id() {
		return distance_Id;
	}
	public int setDistance_Id(int distance_Id) {
		return this.distance_Id = distance_Id;
	}
	public String getSource() {
		return source;
	}
	public String setSource(String source) {
		return this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public String setDestination(String destination) {
		return this.destination = destination;
	}
	public double getDist_in_km() {
		return dist_in_km;
	}
	public double setDist_in_km(double dist_in_km) {
		return this.dist_in_km = dist_in_km;
	}
	public double getDist_in_miles() {
		return dist_in_miles;
	}
	public double setDist_in_miles(double dist_in_miles) {
		return this.dist_in_miles = dist_in_miles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
