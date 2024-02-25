package HashTable;

import java.util.Hashtable;

public class Three {

	public static void main(String[] args) {
		 
		Hashtable <String,String>t = new Hashtable<>();
 		 
		t.put("siva","se");
		t.put("ram", "dev");
		t.put("laxman","hr");
		//t.put(null, null);
		//t.put(null, "hr");
		//t.put("hr", null);
		t.put("laxman", "se");
		//t.put(e, "dev");
		
		
		System.out.println(t);

		//Inserting Userdefined Classes
		Hashtable <Employee,String>t1 = new Hashtable<>();
 		Employee e = new Employee(1,"abcd",90.9);
 		Employee e1 = new Employee(2,"ghij",67.9);
 		t1.put(e, "dev");
 		t1.put(e1, "java dev");
 		System.out.println(t1);
 		
 		
 		 
 		 
	}
	

}
