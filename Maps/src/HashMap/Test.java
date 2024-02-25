package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		HashMap m = new HashMap<>();
	 
		 
		
		m.put("siva", 1);
		m.put("Ram", 2);
		m.put("Lokesh", 3);
		m.put("akhil", 4);
		m.put(null, 5);
		m.put("Lucky", null);
		m.put(null, null);
		m.put("siva", 4);
		 
	
	
		
		System.out.println(m);
		
		System.out.println("Contains Key Method: "+m.containsKey("Ram")+"\n");
		System.out.println("Get Method: "+m.get("Lokesh")+"\n");
		System.out.println("IsEmpty Method: "+m.isEmpty()+"\n");
		System.out.println("Remove Method:"+m.remove("akhil")+"\n");
		System.out.println("Replace Method: "+m.replace(null, "abcd")+"\n");
		System.out.println("Size Method: "+m.size()+"\n");
		System.out.println("***KeySet Method: "+m.keySet()+"\n");
		System.out.println("***Values Method: "+m.values()+"\n");
		System.out.println("***EntrySet Method:"+m.entrySet()+"\n");
		
		
		System.out.println("\n\n"+"-----------------"+"\n\n");
		System.out.println("With Returntypes---"+"\n");
		Set<String>data=m.keySet();
		System.out.println(data);
		System.out.println("\n");
		Collection<String>data1=m.values();
		System.out.println(data1);
		System.out.println("\n");
		Set<Map.Entry<String,Integer>>dat=m.entrySet();
		System.out.println(dat);

	}

}
