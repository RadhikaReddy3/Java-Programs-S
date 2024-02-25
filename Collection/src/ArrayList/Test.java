package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
	
		ArrayList a = new ArrayList<>();
		Employee r = new Employee(1,"Ram",7123.23);
		a.add("siva");
		a.add(55.5);
		a.add("se");
		//a.add(r);
		
		//System.out.println("Size of an array(Add)"+a.size());
		a.addAll(a);
		System.out.println(a);
		System.out.println("Size of an array(Addall)"+a.size());

	}

}
