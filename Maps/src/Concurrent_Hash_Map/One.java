package Concurrent_Hash_Map;
import java.util.concurrent.*;
public class One {

	public static void main(String[] args) {
		 
		ConcurrentHashMap<String,String> t = new ConcurrentHashMap<>(); 
         t.put("abc", "dev");
         t.put("def", "se");
         t.put("def", "jd");
         t.put("abc", "jd");
         t.put("hij", "sd");
         //t.put(null, null);
        // t.put("se", null);
         //t.put(null, "se");
         System.out.println(t);
         
         
     	ConcurrentHashMap<Employee,String> t1 = new ConcurrentHashMap<>();
     	Employee e = new Employee(1,"Siva",67.9);
        t1.put(e, "se");
        System.out.println(t1);
     
	}

}
