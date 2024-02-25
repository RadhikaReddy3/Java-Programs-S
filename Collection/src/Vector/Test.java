package Vector;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
            
		Vector v = new Vector<>();
		
		v.add("Siva");
		v.add(new Student(1,"Ram",56.7));
		v.addElement("Lokesh");
		v.add("abc");
		v.add("def");
		System.out.println(v);
		System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());		

	}

}
