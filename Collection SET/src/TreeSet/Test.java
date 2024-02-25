package TreeSet;
import java.util.TreeSet;

import Difference_btw_working_of_hashcode_In_HashSet_And_ObjectClass.employee1;

public class Test {

	public static void main(String[] args) {
		
		String a = new String("a");
		String b = new String("b");
		
		System.out.println(b.compareTo(a));
		 
		Integer c = new Integer(12);
		Integer d = new Integer(13);
		System.out.println(c.compareTo(d));
		
		 
		
		
		
		TreeSet p = new TreeSet<>();
		
		
		/*p.add(90.9);
		p.add(75.5);
		p.add(67.5);
		p.add(75.5);
		p.add(96.6);
		p.add(45.5);
		p.add(55.5);*/
		p.add(new employee1(1,"Siva",67.5));
		p.add(new employee1(2,"Ram",77.5));
		p.add(new employee1(3,"loki",97.5));
		p.add(new employee1(4,"Bali",107.5));
		
		 
		System.out.println(p);
		
	
	}


	}




/*HashSet: The HashSet class does not rely on the compareTo method. It uses the hashCode method and the equals method to determine whether two objects are considered equal. The ordering of elements in a HashSet is not based on their values, and it does not maintain any specific order.

TreeSet: The TreeSet class, on the other hand, can use the compareTo method (if elements implement the Comparable interface) or a specified Comparator to determine the order of elements. If the elements do not implement Comparable and no Comparator is provided, the TreeSet will throw a ClassCastException at runtime.*/
