package Collections;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class Various_Methods_In_Collections {

	public static void main(String[] args) {
		 
		List<Integer> k = new ArrayList<>();
		k.add(95);
		k.add(55);
		k.add(75);
		System.out.println(k);
		Collections.reverse(k);
        System.out.println("Reverse: "+k);
		Collections.sort(k);
		System.out.println("Ascending order(Sort Method): "+k);
		int min =Collections.min(k);
		System.out.println("Minimum value: "+min);
		int max=Collections.max(k);
        System.out.println("Maxmimum value:"+max);
         
         //Collections.fill(k, 100);
         //System.out.println("Fill:"+k);
        Collections.shuffle(k);
        System.out.println("Shuffle: "+k);
        List<Integer> data=Collections.synchronizedList(k);
        System.out.println("SynchronizedList: "+data);
        List <Integer> da= Collections.unmodifiableList(k);
        
        System.out.println("Before Mod:"+da);
         //da.add(56);
         //System.out.println("mod: "+da);
      
        
        Set<Integer> p=new HashSet<>();
        p.add(34);
        p.add(90);
        p.add(96);
        p.add(76);
        System.out.println("Set:"+p);
        Set<Integer> g =Collections.synchronizedSet(p);
        System.out.println("Synchronized Set:"+g);
        
        Map<String, Integer> m = new HashMap<>();
        m.put("Ram", 99);
        m.put("Siva", 95);
        m.put("lilly", 50);
        System.out.println("Map: "+m);
        Map<String, Integer> f=Collections.synchronizedMap(m);
        System.out.println("Synchronized Map: "+m);
        
 
         

	}

}
