/*/*package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
public class ALiterate {

	public static void main(String[] args) {
		 
		ArrayList p = new ArrayList<>();
		p.add("Siva");
		p.add(34.5);
		p.add('m');
		p.add(true);
		
		Iterator data=p.iterator();
		
		while(data.hasNext()) {
			
			 
			System.out.println(data.next());
		}

	}

}*/

//1st way of removal
/*package Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ALiterate {

	public static void main(String[] args) {
		 
		//ArrayList p = new ArrayList<>();
		List p = new ArrayList<>();
		
		p.add("Siva");
		p.add("Ram");
		p.add("Lokesh");
		p.add("pqrs");
 
		
		Iterator data=p.iterator();
		
		while(data.hasNext()) {
			
			String h = (String)data.next();
		 
			if(h.equals("Siva")) {
				System.out.println("Removed");
				data.remove();
				 
			}
			System.out.println(h); 
			 
		}
        
		System.out.println("\n"+"--After removal--"+"\n");
        
        Iterator data1=p.iterator();{
        	while(data1.hasNext()) {
        		 System.out.println(data1.next());
        	}
        }
	}

}*/

//2nd way of removal
package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
public class ALiterate {

	public static void main(String[] args) {
		 
		ArrayList<String> p = new ArrayList<>();
		p.add("Siva");
		p.add("Ram");
		p.add("Lokesh");
		p.add("Revanth");
		
		Iterator<String> data=p.iterator();
		
		while(data.hasNext()) {
			
			 
			//System.out.println(data.next());
			String h = (String)data.next();
			 
			
			if(h.equals("Siva")) {
				System.out.println("Removed");
				data.remove();
				 
			}
			 
		  
			 
			System.out.println(h);
		}
		
		
		
		//System.out.println(data.next()); 
		System.out.println("\n"+"------List After Removal-------"+"\n");
		 
		
		
		
		for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }
		
		//Enhanced For loop also known as Foreach loop
				/*for (String element : p) {
		            System.out.println(element);
		        }
		}*/

	}}
 