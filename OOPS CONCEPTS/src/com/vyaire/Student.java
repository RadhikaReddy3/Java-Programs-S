package com.vyaire;

public class Student {
	
	private int sid;
	private String sname;
	private double sfee;
	private String[] scou;
	
	public void setSid(int id) {
		this.sid = id;
	}
	
	public void setSname(String name) {
		
		this.sname = name;
		
	}
	
    public void setSfee(double fee) {
    	this.sfee = fee;
    	
    }
    public void setCourse(String[] cou) {
    	this.scou = cou;
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
 public String[] getScou(){
	 	
	 	return this.scou;
	 }
	 	 
 }


