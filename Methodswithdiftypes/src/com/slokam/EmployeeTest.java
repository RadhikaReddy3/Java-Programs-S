package com.slokam;

public class EmployeeTest {
	
	void addemployee() {
		System.out.println("First Method: "+"Execution of addemployee() method "+"\n");
		
		System.out.println("Method Executed"+"\n");
		System.out.println("---------------------------------------"+"\n");
	}
	
	void addallemployees(Employee emp[]) {
		
		System.out.println("Second Method: "+"Execution of addallemployees() method "+"\n");
		
		System.out.println(emp[0].eid);
		System.out.println(emp[0].ename);
		System.out.println(emp[0].esal);
		System.out.println(emp[0].edesig+"\n");
		
		System.out.println(emp[1].eid);
		System.out.println(emp[1].ename);
		System.out.println(emp[1].esal);
		System.out.println(emp[1].edesig+"\n");
		
		System.out.println(emp[2].eid);
		System.out.println(emp[2].ename);
		System.out.println(emp[2].esal);
		System.out.println(emp[2].edesig+"\n");
		
		System.out.println("---------------------------------------"+"\n");
		
	}
	
	
	void getallemployees(Employee emp[]) {
		
	  System.out.println("Third Method: "+"Execution of getallemployees() method "+"\n");
		
	   for(int i=0; i<= emp.length-1;i=i+1) {
		    System.out.println(emp[i].eid);
			System.out.println(emp[i].ename);
			System.out.println(emp[i].esal);
			System.out.println(emp[i].edesig);
			System.out.println("-----Next Employee-----"+"\n");
		   
	   }
	}

	public static void main(String[] args) {
		 
		Employee e = new Employee();
		e.eid = 1;
		e.ename = "Radhika";
        e.esal = 10000000.000;
        e.edesig = "java developer";
		
        Employee e1 = new Employee();
        e1.eid = 2;
		e1.ename = "lucky";
        e1.esal = 13000000.000;
        e1.edesig = "Software developer";
        
        Employee e2 = new Employee();
        e2.eid = 3;
		e2.ename = "Pinky";
        e2.esal = 14000000.000;
        e2.edesig = "Python developer";
        
        
        Employee d[] = {e,e1,e2};
		EmployeeTest t = new EmployeeTest();
		t.addemployee();
		t.addallemployees(d);
		t.getallemployees(d);

	}

}



/*The `EmployeeTest` class defines three methods to perform various operations related to employees. Here's an explanation of each method and its purpose in the context of your code:

1. `addemployee()` Method:
   - This method is used to demonstrate the execution of a simple method.
   - It prints a message indicating that the method is executed.
   - The purpose of this method is to show a basic method structure with no parameters.

2. `addallemployees(Employee emp[])` Method:
   - This method takes an array of `Employee` objects as a parameter and prints the attributes (eid, ename, esal, and edesig) of each employee in the array.
   - It prints a message indicating that the method is executed.
   - The purpose of this method is to display the attributes of multiple employees stored in an array.

3. `getallemployees(Employee emp[])` Method:
   - This method also takes an array of `Employee` objects as a parameter, but it iterates through the array using a `for` loop and prints the attributes of each employee individually.
   - It separates the attributes of different employees with a "-----Next Employee-----" message.
   - The purpose of this method is to demonstrate how to iterate through an array of employees and display their attributes one by one.

In the `main` method:
- Three `Employee` objects (`e`, `e1`, and `e2`) are created with different attributes.
- These objects are stored in an array `d`.
- An instance of the `EmployeeTest` class (`t`) is created to call the methods defined in the class.
- The `addemployee()` method is called to show the execution of a basic method.
- The `addallemployees(d)` method is called to display the attributes of all employees in the array.
- The `getallemployees(d)` method is called to iterate through the array and print the attributes of each employee individually.

When you run the program, it will execute these methods and display the relevant information, including employee attributes and method execution messages.*/
