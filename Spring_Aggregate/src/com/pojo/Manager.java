package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	public Manager() {
		
	}
	 
	 private TeamLead tl;
	 @Autowired 
	public void setTl(TeamLead tl) {
		this.tl = tl;
	}

	public void doWork() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }

}
