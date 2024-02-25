package com.controller;
 
 
import java.util.ArrayList;

import com.pojo.employee;

public class FileDao {
	
	
	public employee getbyId(int eid) {
		
		 
		
		employee emp = new employee(101,"siva",23,95.5,"se");
		
		return emp;
	}
 
	public ArrayList<employee> getAll() {
		
  
		
		 ArrayList<employee> k=new ArrayList<employee>();
		 k.add(new employee(1,"siva",23,95.5,"se"));
		 k.add(new employee(2,"ram",21,90.5,"dev"));
		 k.add(new employee(3,"mahi",24,91.5,"sde"));
	 
		 return k;
		 
	}
	
	
	public static void main(String[] args) {
	
		  
	 
	}

}
