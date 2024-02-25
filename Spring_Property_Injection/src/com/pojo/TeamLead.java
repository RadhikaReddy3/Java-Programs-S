package com.pojo;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class TeamLead {
	 
	private Developer dev;
	private Manager m;
	public void doWork() {
		
		System.out.println("TeamLead Work started");
		dev.doWork();
		System.out.println("TeamLead Work completed");
		
	}
public void doWork1() {
		
		System.out.println("TeamLead Work started");
		dev.doWork();
		System.out.println("TeamLead Work completed");
		
	}
public void doWork2() {
	
	System.out.println("TeamLead Work started");
	dev.doWork();
	System.out.println("TeamLead Work completed");
	
}
	 
}
