package Difference_btw_working_of_hashcode_In_HashSet_And_ObjectClass;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSettest {

	public static void main(String[] args) {
		
		/*employee1 t= new employee1(1,"Ram",90.9);
		employee1 t1 = new employee1(2,"Siva",65.6);
		employee1 t2= new employee1(1,"Ram",90.9);
		employee1 t3 = new employee1(4,"Siva",65.6);
		employee1 t4= new employee1(1,"Aa",90.9);
		employee1 t5 = new employee1(2,"BB",90.9);*/
		
		/*employee1 t= new employee1(1,"siva",90.90);
		employee1 t1 = new employee1(2,"laxman",70.90);
		employee1 t2= new employee1(3,"zaheer",96.90);
		employee1 t3 = new employee1(4,"rahul",91.90);
		employee1 t4= new employee1(5,"Aa",90.90);
		//employee1 t5 = new employee1(5,"BB",90.90);
		
		LinkedHashSet p = new LinkedHashSet<>();
		 
		p.add(t);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		//p.add(t5);
		
		
		Iterator k = p.iterator();
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		 
		//System.out.println(p);
        System.out.println(p.contains(new employee1(5,"Aa",90.90)));
	}

}*/
		LinkedHashSet p = new LinkedHashSet<>();
		p.add(new employee1(1,"Siva",67.5));
		p.add(new employee1(2,"Ram",77.5));
		p.add(new employee1(3,"loki",97.5));
		p.add(new employee1(4,"Bali",107.5));
		
		 
		System.out.println(p);
	}}
