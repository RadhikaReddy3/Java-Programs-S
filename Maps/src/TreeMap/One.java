//Before Addition Of Dept Class


/*package TreeMap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class One {

	public static void main(String[] args) {
		 
		TreeMap <Employee,Integer> k = new TreeMap<>(new BasedonId());
		k.put(new Employee(1,"siva",56.7,"se"),1000);
		k.put(new Employee(2,"Ram",66.7,"dev"),797);
		k.put(new Employee(3,"Lokesh",76.7,"jdev"),456);
		
		//System.out.println(k);
		
		//	EntrySet, KeySet
		
		
		//EntrySet using ForEach
		//Set<Map.Entry<Employee,Integer>> p= k.entrySet();
		for(Map.Entry<Employee, Integer>p:k.entrySet()) {
			//System.out.println(p.getKey()+""+p.getValue());
		}

		//KeySet using Foreach
	    //Set<Employee> data = k.keySet();
	   for(Employee h: k.keySet()) {
		   //System.out.println(h);
		   //System.out.println(k.get(h));
	   }   
		   
		 //EntrySet using Iterator
	     //Iterator using while loop
	   
	   Set<Map.Entry<Employee,Integer>> r=k.entrySet();
	   Iterator<Entry<Employee, Integer>>m =r.iterator();
	   
	   while(m.hasNext()) {
		   //System.out.println(m.next());
	   }
	}

}*/

//After Addition Of Dept userdefined class.
package TreeMap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class One {

	public static void main(String[] args) {
		 
		TreeMap <Employee,Dept> k = new TreeMap<>(new BasedonId());
		k.put(new Employee(1,"siva",56.7,"se"),(new Dept(101,"IT","hyd")));
		k.put(new Employee(2,"Ram",66.7,"dev"),(new Dept(102,"NonIT","SCD")));
		k.put(new Employee(3,"Lokesh",76.7,"jdev"),(new Dept(103,"CSE","Wgl")));
		System.out.println(k.headMap(new Employee(2,"Ram",66.7,"dev")));
		System.out.println(k.tailMap(new Employee(2,"Ram",66.7,"dev")));
		System.out.println(k);
		
		//	EntrySet, KeySet
		
		
		//EntrySet using ForEach
		//Set<Map.Entry<Employee,Integer>> p= k.entrySet();
		for(Map.Entry<Employee, Dept>p:k.entrySet()) {
			//System.out.println(p.getKey()+""+p.getValue());
		}

		//KeySet using Foreach
	    //Set<Employee> data = k.keySet();
	   for(Employee h: k.keySet()) {
		   //System.out.println(h);
		   //System.out.println(k.get(h));
	   }   
		   
		 //EntrySet using Iterator
	     //Iterator using while loop
	   
	   Set<Map.Entry<Employee,Dept>> r=k.entrySet();
	   Iterator<Entry<Employee,Dept>>m =r.iterator();
	   
	   while(m.hasNext()) {
		   //System.out.println(m.next());
	   }
	}

}
