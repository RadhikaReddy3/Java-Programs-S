//This Program is for HashSet HashCode working 




package Difference_btw_working_of_hashcode_In_HashSet_And_ObjectClass;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		 
		String t = new String("Aa");
		String t1 = new String("BB");
		
		
		//String t = new String("Siva");
		//String t1 = new String("Ram");
		
		System.out.println("String t hashcode: "+t.hashCode());
		System.out.println("String t1 hashcode: "+t1.hashCode());
		System.out.println("String .equals: "+t.equals(t1));
		System.out.print("String ==: ");
		System.out.print(t==t1);
		
		Integer p = new Integer(12);
		Integer p1 = new Integer(12);
		
		//Integer p = new Integer(12);
		//Integer p1 = new Integer(14);
		
		System.out.println("\n\n"+"Integer p hashcode: "+p.hashCode());
		System.out.println("Integer p1 hashcode: "+p1.hashCode());
		System.out.println("Integer .equals: "+p.equals(p1));
		System.out.print("Integer ==: ");
		System.out.print(p==p1);
	    //HashSet hs = new HashSet<>();
	    LinkedHashSet hs = new LinkedHashSet<>();
		Employee k = new Employee(1,"Lokesh",76.3);
		Employee k1 = new Employee(2,"Ram",77.3);
		Employee k2 = new Employee(1,"Lokesh",76.3);
		hs.add("siva");
		hs.add(34.5);
		hs.add("siva");
		hs.add("Aa");
		hs.add("BB");
		hs.add(34.5);
	    hs.add(k);
	    hs.add(k1);
	    hs.add(k2);
		
	    //System.out.println("\n\n"+"Hashset: "+hs);
		System.out.println("\n\n"+"LinkedHashset: "+hs);
		
		
		
		

	}

}
