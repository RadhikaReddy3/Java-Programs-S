package com.controller;

import java.io.FileWriter;

import com.pojo.Employee;

public class FileDao {

	 public void insert(Employee e) {
		 System.out.println("I am in File Dao");
		 System.out.println("Data inserted in to File Successfullty----");
		 
		 
	 
	 try {
	 FileWriter fr = new FileWriter("E:\\Slokam Files\\Emp.txt",true);
	 fr.write("Employee ID: "+e.getEid()+"\n"+
	 "Employee Name: "+e.getEname()+"\n"+
	 "Employee Salary: "+e.getEsal()+"\n"+
	 "Employee Designation: "+e.getEdesg());
	 fr.close();
	 }
	 catch(Exception e1) {
		 System.out.println("Exception");
	 }
}
}