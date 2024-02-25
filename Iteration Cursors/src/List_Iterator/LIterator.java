package List_Iterator;
import java.util.ArrayList;

import java.util.ListIterator;

public class LIterator {

	public static void main(String[] args) {
		 
	   ArrayList<String> t = new ArrayList<>();
	   t.add("Siva");
	   t.add("Ram");
	   t.add("Lokesh");
	   t.add("Siva");
	   
	   //ListIterator<String> data = t.listIterator();
	   /*while(data.hasNext())
	    {
		   
		   String h = data.next();
		   if(h.equals("Lokesh")) {
			   
			   /*LISTITERATOR: Hasnext next remove add set hasPrevious in list iterator
			   //data.remove();
			   //System.out.println("Removed");
			   data.add("abcd");
			   System.out.println("Add data");
			   //data.set("Loki");
			   //System.out.println("Modified");
		   }*/
	   //HAS PREVIOUS
	   ListIterator<String> data = t.listIterator(t.size());
	   while(data.hasPrevious()) {
		   String h = data.previous();
		   if(h.equals("Lokesh")) {
			   
			   //data.remove();
			   //System.out.println("Removed");
			   data.add("abcd");
			   System.out.println("Add data");
			   //data.set("Loki");
			   //System.out.println("Modified");
		   }
		   
	   }
	   System.out.println(t);
	   

	}

}
