package com.Emp;

public class EmpTest {

	public static void main(String[] args) {
		 
		Employee e = new Employee();
		//e.eid;
		 
	    System.out.println("First Employee Details"+"\n");
		System.out.println("Employee ID: "+e.getEid());
		System.out.println("Employee Name: "+e.getEname()); 
		System.out.println("Employee Salary: "+e.getEsal()+"\n\n\n");
		
		e.setEid(2);
		e.setEname("ram");
		e.setEsal(99.9);
		
		System.out.println("Second Employee Details"+"\n");
		System.out.println("Employee ID: "+e.getEid());
		System.out.println("Employee Name: "+e.getEname()); 
		System.out.println("Employee Salary: "+e.getEsal());
		
		 
		 

	}

}
