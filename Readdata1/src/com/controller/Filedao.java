package com.controller;

import com.pojo.Employee;
 
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Filedao {
	
	public Employee getbyId(int eid) {
		Employee emp = new Employee();
		try {
			 FileReader fr = new FileReader("E:\\Slokam Files\\empdataone.txt");
			 BufferedReader br = new BufferedReader(fr);
			 
			 for(String h=br.readLine();h!=null;h=br.readLine()) {
				 
				 String[] n=h.split(",");
				 if (!n[0].isEmpty() &&eid==Integer.parseInt(n[0])) {
					 emp.setEid(Integer.parseInt(n[0]));
					 emp.setEname(n[1]);
					 emp.setEage(Integer.parseInt(n[2]));
					 emp.setEsal(Double.parseDouble(n[3]));
					 emp.setEdesg(n[4]);
				 }
				 
				  
			 }
			
 
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
		
		return emp;
	}

	
	
	 public ArrayList<Employee> getAll() {
	    	ArrayList<Employee> employeeList = new ArrayList<>();
	    	try {
	    		FileReader fr = new FileReader("E:\\Slokam Files\\empdataone.txt");
	    		BufferedReader br = new BufferedReader(fr);
	    		for(String h = br.readLine(); h!=null; h = br.readLine()) {
					System.out.println(h);
				}
	    	}catch(Exception e) {
	    		 e.printStackTrace();
	    	}
	    	return employeeList;

}}
