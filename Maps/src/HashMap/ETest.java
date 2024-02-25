package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ETest {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put(new Employee(1,"Ram",60.7), "IT");
		m.put(new Employee(2,"Siva",70.6), "NonIT");
		m.put(new Employee(3,"Loki",90.5), "CSE");
		m.put(new Employee(4,"Bali",50.4), "ECE");
		m.put(new Employee(3,"Loki",90.5), "CSE");
		m.put(new Employee(4,"Bali",50.4), "ECE");
		
		System.out.println("KeySet----");
		Set<Employee> k = m.keySet();
		
		Iterator<Employee> o =k.iterator();
		
		while(o.hasNext()) {
			Employee emp = o.next();
			System.out.println(emp+"------"+m.get(emp));
		}
		System.out.println("\n\n\n");
		System.out.println("EntrySet------");
		Set<Map.Entry<String, Integer>> dat=m.entrySet();
		
		Iterator<Entry<String,Integer>> f = dat.iterator();
		while(f.hasNext()) {
			System.out.println(f.next());
		}

		
		
	    //System.out.println(m);
         
	}

}
