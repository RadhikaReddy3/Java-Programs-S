package com.slokam;

public class EmployeeTest1 {
	
	void addEmployee() //This method creates an instance of the Employee class, sets its attributes (eid, ename, esal, and edesig), and then prints these attributes.
	{
		Employee e = new Employee();
		 e.eid=1;
		 e.ename="radhika";
		 e.esal=123.45;
		 e.edesig="java developer";
		 System.out.println("------1---------");
		 System.out.println(e.eid);
		 System.out.println(e.ename);
		 System.out.println(e.esal);
		 System.out.println(e.edesig);
		
	 }
	
	void addEmployee1(Employee e) //This method takes an instance of the Employee class as a parameter and prints the attributes of that employee.
	{
		 System.out.println("------2---------");
		 System.out.println(e.eid);
		 System.out.println(e.ename);
		 System.out.println(e.esal);
		 System.out.println(e.edesig);
		 System.out.println("Method executed");
	}
	void addAllEmployee(Employee e[]) //This method takes an array of Employee objects as a parameter and iterates through the array to print the attributes of each employee in the array.
	{
		
		 System.out.println("------3---------");
		 for(int i=0;i<=e.length-1;i++) 
		 {
		 System.out.println(e[i].eid);
		 System.out.println(e[i].ename);
		 System.out.println(e[i].esal);
		 System.out.println(e[i].edesig);
		 }
		 System.out.println("Method executed");
	}
	
	Employee m1() //This method creates an instance of the Employee class, sets its attributes, and returns the created employee object.
	{
		 System.out.println("------4---------");
		Employee e = new Employee();
		 e.eid=4;
		 e.ename="cd";
		 e.esal=1333.45;
		 e.edesig="cdd";
		
		return e;
	}
	Employee m1(Employee e1) //This method takes an instance of the Employee class as a parameter, sets its attributes and prints them, and then returns the modified employee object.
	{
		 System.out.println("------5---------");
		 Employee s = new Employee();
		 System.out.println(s.eid=3);
		 System.out.println(s.ename="bcd");
		 System.out.println(s.esal=333.45);
		 System.out.println(s.edesig="web developer");
		
		return s;
	}
	Employee[] m1(Employee e2[])//The m1(Employee e2[]) method is designed to take an array of Employee objects as a parameter and then iterate through the array to print the attributes of each employee.
	{
		System.out.println("------6---------");
		 
		for(int i=0;i<e2.length;i++) {
			 System.out.println(e2[i].eid);
			 System.out.println(e2[i].ename);
			 System.out.println(e2[i].esal);
			 System.out.println(e2[i].edesig);
			  
		}
		 return e2;
		 
	}
	
	 
	
	 
	public static void main(String[] args) {
		
		//For void return type and execution of a method without any parameters
		EmployeeTest1 t = new EmployeeTest1();
		t.addEmployee();
		 
		//For void return type and execution of a method with parameters
		 Employee e1 = new Employee();
		 e1.eid=1;
		 e1.ename="abcd";
		 e1.esal=123.45;
		 e1.edesig="dev";
		 t.addEmployee1(e1);
		 
		 //For void return type and execution of a method with parameters as arrays
		Employee e2 = new Employee();
		 e2.eid=2;
		 e2.ename="ccccc";
		 e2.esal=189.45;
		 e2.edesig="se";
		 Employee[] r= {e1,e2};
		 t.addAllEmployee(r);
		 
		 // For Employee return type and execution of a method without any parameters
		 Employee e3= t.m1();
		 System.out.println(e3.eid);
		 System.out.println(e3.ename);
		 System.out.println(e3.esal);
		 System.out.println(e3.edesig);
		 
		 //For Employee return type and execution of a method with parameters
		  t.m1(e1);
		  
		 //For Employee return type and execution of a method with parameters as arrays

	        Employee[] e4 = { e1, e2,e3 };
	        t.m1(e4);
	        
	         
	
	}

}
