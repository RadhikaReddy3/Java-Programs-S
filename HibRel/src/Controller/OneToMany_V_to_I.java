package Controller;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import Pojo.*;

public class OneToMany_V_to_I {
	
	public void savedata() {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Vendor p = new Vendor();
		p.setVid(5);
		p.setVname("IPHONE");
		p.setVloc("Hyd");
		
	     List<Items> ite = new ArrayList<>();
	     ite.add(new Items("cho","2024","2025"));
	     ite.add(new Items("bis","2027","2029"));
	     ite.add(new Items("cho","2030","2035"));
	     
	     p.setIt(ite);
	     r.save(p);
	     t.commit();
	     r.close();
		 	
	}

	public static void main(String[] args) {
		OneToMany_V_to_I h = new OneToMany_V_to_I();
		h.savedata();

	}

}
