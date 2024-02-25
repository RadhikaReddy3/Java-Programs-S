package com.pojo;

public class TeamLead {
	
	public void setDev(Developer dev) {
		this.dev = dev;
	}

	private Developer dev;
	
	public TeamLead(Developer dev) {
		super();
		this.dev = dev;
	}

	public void doWork() {
		
		System.out.println("TeamLead Work started");
		dev.doWork();
		System.out.println("TeamLead Work completed");
		
	}
	public TeamLead() {
		
	}

}
