package com.pojo;

public class Manager {
	
	  
	 private TeamLead tl;
	 
	 
	public void doWork() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }

}
