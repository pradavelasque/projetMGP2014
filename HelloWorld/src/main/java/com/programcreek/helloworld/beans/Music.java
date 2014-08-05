package com.programcreek.helloworld.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Music {
	@Autowired
	private String name;
	
	@Autowired
	private String etat;
	
	@Autowired
	private double time;
	
	@Autowired
	public Music(String name, String etat, double time) {
		super();
		this.name = name;
		this.etat = etat;
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	

}
