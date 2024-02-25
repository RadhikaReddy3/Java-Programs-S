package com.pojo;

public class Manager {
	
	public Manager() {
		
	}

	 private TeamLead tl;
	 
	 public Manager(TeamLead tl) {
		super();
		this.tl = tl;
	}

	public void setTl(TeamLead tl) {
		this.tl = tl;
	}

	public void doWork() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }

}
