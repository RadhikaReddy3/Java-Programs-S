package Basics_And_Checking_Functionality_Of_Various_Classes;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Collection;
import java.util.ArrayList;
//import Readdata.com.controller.*;
public class LArrayList {

	public static void main(String[] args) {
	 //List a = new ArrayList<>();
		ArrayList<Object> a = new ArrayList<>();
		//Collection a = new ArrayList<>();
		
		String p = new String("pet");
		Integer h = new Integer(90);
		
		Employee e = new Employee(1,"siva",538758.34,9853849243L);
		a.add("Slokam");
		ArrayList k = new ArrayList<>();
		k.add(p);
		k.add(h);
		k.add("Hi!");
	    k.add(34.5);
	    k.add("Hi!");
	    k.add(e);
	    System.out.println(k);
	    System.out.println("Get particular index value"+k.get(0));
	    System.out.println("Is Empty method: "+k.isEmpty());
	    System.out.println("Contains method:"+k.contains(34.5));
	    System.out.println("IndexOf: "+k.indexOf(34.5));
	    System.out.println("Last Index Of:"+k.lastIndexOf("Hi!"));
		System.out.println("Remove: "+k.remove(2)); 
		System.out.println("After Remove: "+k);
		System.out.println("Set value(Updating values): "+k.set(0, "Ram"));
		System.out.println("After Set: "+k);
		 k.add(2, "abcd");
		 System.out.println("After add: "+k);
		 System.out.println("Size: "+k.size());
		 //k.clear();
		 System.out.println("Is Empty: "+k.isEmpty());
		 
		 
		 
		

		//System.out.println(k);
	}

}

 
