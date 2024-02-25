package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TeamLead {
	
	@Autowired 
	public void setDev(Developer dev) {
		this.dev = dev;
	}
	 
	private Developer dev;
	 
	 

	public void doWork() {
		
		System.out.println("TeamLead Work started");
		dev.doWork();
		System.out.println("TeamLead Work completed");
		
	}
	public TeamLead() {
		
	}

}
