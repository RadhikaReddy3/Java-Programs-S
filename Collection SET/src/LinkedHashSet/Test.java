package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
	 //LINKEDHASHSET: Insertion order  preserved
		LinkedHashSet e = new LinkedHashSet<>();
		e.add("siva");
		e.add(null);
		e.add(34.5);
		e.add("siva");
		e.add(34);
		e.add("Ram");
		
		System.out.println(e);
		System.out.println(e.add("Lokesh"));
		System.out.println(e);
		
		Iterator b = e.iterator();
		
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
	}

}

