package com.controller;
import com.pojo.Employee;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		 FileDao f = new FileDao(); 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Employee ID: ");
		 int eid = sc.nextInt();
		 
		 System.out.println("Enter Employee Name: ");
		 String ename = sc.next();
		  
		 
		 System.out.println("Enter Employee Salary: ");
		 double esal = sc.nextDouble();
		 
		 
		 System.out.println("Enter Employee Designation: ");
		 String edes = sc.next();
		 
		 Employee e = new Employee();
		 e.setEid(eid);
		 e.setEname(ename);
		 e.setEsal(esal);
		 e.setEdesg(edes);
		 
		 System.out.println("\n"+"Setter Initialization"+"\n");
		  
		  
		 /*e.setEid(1);
		 e.setEname("Siva");
		 e.setEsal(3839123.293);
		 e.setEdesg("se");*/
		 
		 f.insert(e);
		 
		  
		 
		 /*System.out.println("Enter Employee ID: ");
		 int emid = sc.nextInt();
		  
		 System.out.println("Enter Employee Name: ");
		 String emname = sc.next();
		 
		 
		 System.out.println("Enter Employee Salary: ");
		 double emsal = sc.nextDouble();
		  
		 
		 System.out.println("Enter Employee Designation: ");
		 String emdes = sc.next();
		 
		 System.out.println("\n"+"Constructor Initialization"+"\n");
		 
		 //Employee e1 = new Employee(2,"ram",45684.8347,"dev");
		 Employee e1 = new Employee(emid,emname,emsal,emdes);
		 f.insert(e1);

		 
		  
		 System.out.println("Enter Employee ID: ");
		 int empid = sc.nextInt();
		  
		 System.out.println("Enter Employee Name: ");
		 String empname = sc.next();
		 
		 
		 System.out.println("Enter Employee Salary: ");
		 double empsal = sc.nextDouble();
		  
		 
		 System.out.println("Enter Employee Designation: ");
		 String empdes = sc.next();
		 
		 
		 System.out.println("\n"+"Anomalous Initialization"+"\n");
		 
		 //f.insert(new Employee(3,"mahi",905684.8347,"jd"));
		 f.insert(new Employee(empid,empname,empsal,empdes));*/
		 sc.close();
	}

}
