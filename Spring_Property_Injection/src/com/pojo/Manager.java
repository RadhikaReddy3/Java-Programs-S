package com.pojo;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Manager {
	
	  
	 private TeamLead tl;
	 private Developer dev;
	 
	public void doWork3() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }
	public void doWork4() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }
	public void doWork5() {
		 System.out.println("Manager Work Started");
		 tl.doWork();
		 System.out.println("Manager Work Completed");
	 }
	

}
