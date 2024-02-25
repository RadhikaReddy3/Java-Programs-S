package Concurrent_Hash_Map;

import java.util.HashMap;
import java.util.concurrent.*;

import WeakHashMap.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"siva",50.9);
		Employee e2 = new Employee(2,"Ram",60.5);
		Employee e3 = new Employee(3,"Lokesh",70.6);
		//e1=e2; //(While usage of HashMap)
		ConcurrentHashMap<Employee,Integer> h = new ConcurrentHashMap<>();
		h.put(e1, 56);
		h.put(e2, 75);
		h.put(e3, 95);
		
		
		e1=e2;
		//System.gc();
	    //System.out.println("Done printing the data");
		System.out.println(h); 

	}

}
