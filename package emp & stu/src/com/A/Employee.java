package com.A;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter Employee Details:"+"\n");
		 
		 System.out.println("Enter Employee ID:");
		 int eid = s.nextInt();
		 
		 System.out.println("Enter Employee Name:");
		 String ename = s.next();
		 
		 System.out.println("Enter Employee Salary:");
		 double esal = s.nextDouble();
		 
		 System.out.println("Enter Employee Designation:");
		 String edes = s.next();
		 
		 System.out.println("Enter Employee Department:");
		 String edep = s.next();
		 
		 System.out.println("Enter Employee Marriage Status:");
		 boolean ems = s.nextBoolean();
		 
		 System.out.println("\n"+"Employee ID: "+eid);
		 System.out.println("Employee Name: "+ename);
		 System.out.println("Employee Salary: "+esal);
		 System.out.println("Employee Designation: "+edes);
		 System.out.println("Employee Department: "+edep);
		 System.out.println("Employee Marriage Status: "+ems);
		 
		 s.close();
		 

	}

}
