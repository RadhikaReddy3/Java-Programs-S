package com.controller;
import com.pojo.Manager;
import com.pojo.TeamLead;
import com.pojo.Developer;
public class Test {
	
	public static void main1(String[] args) {
	
	//CONSTRUCTOR INJECTION
	Developer d = new Developer(); 
	TeamLead t = new TeamLead(d);
	Manager ma = new Manager(t);
	  
	ma.setTl(t);
	t.setDev(d);
	ma.doWork();
     
}
	
	public static void main(String[] args) {
		
		//SETTER INJECTION 
	  
		Manager ma = new Manager();
		TeamLead t = new TeamLead();
		Developer d = new Developer(); 
		 
		//ma.setTl(t);
		ma.setDe(d);
		//t.setDev(d);
		ma.doWork();
	 
	     
	}
}
