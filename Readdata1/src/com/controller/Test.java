package com.controller;

import java.util.ArrayList;

import com.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		 Filedao v=new Filedao();
		 Employee emp=v.getbyId(101);

		 System.out.println(emp.getEid()+"---"+emp.getEname()+"---"+emp.getEage()+"---"+emp.getEsal()+"---"+emp.getEdesg());

		 
		 System.out.println("\n"+"All Employee Details"+"\n");
		 ArrayList<Employee> data = v.getAll();
	        for (int i = 0; i <= data.size() - 1; i++) {
	            System.out.println("emp id - " + data.get(i).getEid() 
	            		+ " Emp name - "+ data.get(i).getEname() +" Emp age - " 
	            		+ data.get(i).getEage() + " Emp salary - " 
	            		+ data.get(i).getEsal() +" Emp desg - " + data.get(i).getEdesg());
	        }
	}

}
