package WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WTest {

	public static void main1(String[] args) {
		
		//Weak HashMap Checks while adding and printing(Retrieval of data) the data whether reference present or not 
		Employee e1 = new Employee(1,"siva",50.9);
		Employee e2 = new Employee(2,"Ram",60.5);
		Employee e3 = new Employee(3,"Lokesh",70.6);
		//e1=e2;(While usage of HashMap)
		WeakHashMap<Employee,Integer> h = new WeakHashMap<>();
		h.put(e1, 56);
		h.put(e2, 75);
		h.put(e3, 95);
		
		
		e1=e2;//(While Usage of WeakHashMap)
		System.gc();
	    System.out.println("Done printing the data");
		System.out.println(h);
	}
	public static void main(String[] args) {
		 
		Employee e1 = new Employee(1,"siva",50.9);
		Employee e2 = new Employee(2,"Ram",60.5);
		Employee e3 = new Employee(3,"Lokesh",70.6);
		//e1=e2; //(While usage of HashMap)
		HashMap<Employee,Integer> h = new HashMap<>();
		h.put(e1, 56);
		h.put(e2, 75);
		h.put(e3, 95);
		
		
		e1=e2;//(While Usage of WeakHashMap)
		System.gc();
	    System.out.println("Done printing the data");
		System.out.println(h);
	}

}
