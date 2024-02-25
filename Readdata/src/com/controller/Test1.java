package com.controller;

import java.util.ArrayList;

import com.pojo.employee;

public class Test1 {

	public static void main(String[] args) {
		 FileDao1 v =new FileDao1();
		 employee emp =v.getById(106);
		 System.out.println(emp.getEid()+"---"+emp.getEname()+"---"+emp.getEage()+"---"+emp.getEsal()+"---"+emp.getEdes());
		 // Testing getAll method
		 ArrayList<employee> data=v.getAll();
		 for(int i=0;i<=data.size()-1;i++) {
			 System.out.println("emp id - " + data.get(i).getEid() 
	            		+ " Emp name - "+ data.get(i).getEname() +" Emp age - " 
	            		+ data.get(i).getEage() + " Emp salary - " 
	            		+ data.get(i).getEsal() +" Emp desg - " + data.get(i).getEdes());
		 }
		 System.out.println("\n\n\n");
		// Testing getbyName method for "siva"
			 ArrayList<employee> dataByName = v.getbyName();
		        for (int j = 0; j < dataByName.size(); j++) {
		            System.out.println("emp id - " + dataByName.get(j).getEid() +
		                    " Emp name - " + dataByName.get(j).getEname() + " Emp age - "
		                    + dataByName.get(j).getEage() + " Emp salary - "
		                    + dataByName.get(j).getEsal() + " Emp desg - " + dataByName.get(j).getEdes());
		        }
	}

	}
