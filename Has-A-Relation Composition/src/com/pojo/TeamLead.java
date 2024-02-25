package com.pojo;

public class TeamLead {
	
	 

	private Developer dev = new Developer();
	
	 
	public void doWork() {
		
		System.out.println("TeamLead Work started");
		dev.doWork(); 
		System.out.println("TeamLead Work completed");
		
	}
	
	public TeamLead() {
		
	}

}
