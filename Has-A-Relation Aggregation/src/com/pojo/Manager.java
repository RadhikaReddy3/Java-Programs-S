package com.pojo;

public class Manager {
	
	public Manager() {
		
	}

	 private TeamLead tl;
	 private Developer de;
	 
	 public void setDe(Developer de) {
		this.de = de;
	}

	public Manager(TeamLead tl) {
		super();
		this.tl = tl;
	}

	public void setTl(TeamLead tl) {
		this.tl = tl;
	}

	public void doWork() {
		 System.out.println("Manager Work Started");
		 //tl.doWork();
		 de.doWork();
		 System.out.println("Manager Work Completed");
	 }

}
