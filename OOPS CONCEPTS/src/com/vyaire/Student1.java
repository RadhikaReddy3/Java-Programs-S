package com.vyaire;

public class Student1 {
	private int sid;
	private String sname;
	private double sfee;
	private Course[] cou;
	
	public void setCourse(Course[] co) {
		this.cou =co;
	}
	public Course[] getCourse(){
		return this.cou;
	}
	
	public void setSid(int id) {
		this.sid = id;
	}
	
	public void setSname(String name) {
		
		this.sname = name;
		
	}
	
    public void setSfee(double fee) {
    	this.sfee = fee;
    	
    }
     
    public int getSid()
    {
    	
    return this.sid;
    }
 public String getSname(){
    	
    	return this.sname;
    }
 public double getSfee(){
 	
 	return this.sfee;
 }
  

}
