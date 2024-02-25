package Enumeration;

import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Vector;

public class VectorIterate {

	public static void main(String[] args) {

        Vector k = new Vector<>();
        
        //ArrayList k = new ArrayList<>();
        k.add("siva");
        k.add(56.7);
        k.add('m');
        k.add(true);
        k.iterator();
        k.listIterator();
        
        
        Enumeration data = k.elements();
        
        while(data.hasMoreElements()) {
        	System.out.println(data.nextElement());
        }

	}

}
