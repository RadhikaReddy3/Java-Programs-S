package LinkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
 
		LinkedList k = new LinkedList<>();
		
		k.add("Siva");
		k.add(34.5);
		k.add('m');
		k.add(new Employee(1,"Ram",56.7));
		k.add(new Employee(2,"Lokesh",90.9));
		
		
		System.out.println(k);
		System.out.println(k.size());
		k.addAll(k);
		System.out.println(k.size());
		
     
		k.addFirst("Lilly");
		k.removeFirst();
		
		k.add("Siva");
		k.removeLastOccurrence("Siva");
		
		System.out.println(k);
		 

	}

}
