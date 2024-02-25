package com.controller;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

 
import com.pojo.employee;

public class FileDao1 {

	 public employee getById(int eid) {
		 employee emp= new employee();
		 try {
			 
			 FileReader fr = new FileReader("E:\\Slokam Files\\empdataone.txt");
			 BufferedReader br= new BufferedReader(fr);
			 
			 for(String s= br.readLine();s!=null;s= br.readLine()) 
			 {
				 String[] n=s.split(",");
				 
				//If I need to know which line should I need to put in to employee object I need if condition
					//If I need to take if condition. It must check all the lines for eid
				 if(!n[0].isEmpty()&&eid==Integer.parseInt(n[0])) {
					 emp.setEid(Integer.parseInt(n[0]));
					 emp.setEname(n[1]);
					 emp.setEage(Integer.parseInt(n[2]));
					 emp.setEsal(Double.parseDouble(n[3]));
					 emp.setEdes(n[4]);
					 
				 }
				 
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 return emp;
		 
		 
	 }
	 
	 public ArrayList<employee> getAll() {
	    	ArrayList<employee> data = new ArrayList<>();
	    	
	    	
	    	
	    	 
	    	try {
	    		
	    		 
	    		FileReader fr = new FileReader("E:\\Slokam Files\\empdataone.txt");
	    		BufferedReader br = new BufferedReader(fr);
	    		
	    	
	    		
	    		for(String s = br.readLine(); s!=null; s = br.readLine()) {
	    			employee emp = new employee();
	    			String[]n = s.split(",");
	    			 if (!n[0].isEmpty()) {
/*The condition if (!n[0].isEmpty()) checks whether the first element of the array n is not empty for each line in the file. In the context of your code, n represents the values obtained by splitting each line using a comma (,).

So, for each line in your file, the condition checks if the first element (index 0) of the array n is not an empty string before attempting to process the line. This is done to ensure that the line has a valid value for the employee ID (the first field in your data).*/
	    			emp.setEid(Integer.parseInt(n[0]));
					 emp.setEname(n[1]);
					 emp.setEage(Integer.parseInt(n[2]));
					 emp.setEsal(Double.parseDouble(n[3]));
					 emp.setEdes(n[4]);
	    			
					data.add(emp);
	    			}
				}
	    	}catch(Exception e) {
	    		 e.printStackTrace();
	    	}
	    	return data;
	 }
	   
	 
	 
	 public ArrayList<employee> getbyName() {
	    	ArrayList<employee> data1 = new ArrayList<>();
	    	
	    	
	    	
	    	 
	    	try {
	    		
	    		 
	    		FileReader fr = new FileReader("E:\\Slokam Files\\empdataone.txt");
	    		BufferedReader br = new BufferedReader(fr);
	    		
	    	
	    		
	    		for(String s = br.readLine(); s!=null; s = br.readLine()) {
	    			employee emp = new employee();
	    			String[]n = s.split(",");
	    			if (!n[0].isEmpty() && "siva".equals(n[1])) {
/*The condition if (!n[0].isEmpty()) checks whether the first element of the array n is not empty for each line in the file. In the context of your code, n represents the values obtained by splitting each line using a comma (,).

So, for each line in your file, the condition checks if the first element (index 0) of the array n is not an empty string before attempting to process the line. This is done to ensure that the line has a valid value for the employee ID (the first field in your data).*/
	    			emp.setEid(Integer.parseInt(n[0]));
					 emp.setEname(n[1]);
					 emp.setEage(Integer.parseInt(n[2]));
					 emp.setEsal(Double.parseDouble(n[3]));
					 emp.setEdes(n[4]);
	    			
					data1.add(emp);
	    			}
				}
	    	}catch(Exception e) {
	    		 e.printStackTrace();
	    	}
	    	return data1;
	 }
	   
	 
	 
	 
	 }
