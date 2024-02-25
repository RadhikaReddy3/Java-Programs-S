package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.product;

public class pdtDao {
	
	public void savedata(product pro) {
		System.out.println("Saving the emp data to database partially");
		// System.out.println(em);
		 
		 Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		  s.save(pro);
		  t.commit();
		  s.close();

	}

 
 
	public void getByID(int pid) {
		System.out.println("Saving the emp data to database partially");
		
		 Session s= getCon.con();

		  product e =(product)s.get(product.class, pid);
		  System.out.println(e);
		  s.close();
		
	}
	
	public void updatedata() {
		
		 Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		  product e = (product)s.get(product.class, 2); 
		   
		  e.setPname("bis");
		  e.setPprice(764.5);
		  e.setPde(true);
		  s.update(e);
		  t.commit();
		  s.close();
		
	}
	
public void deletedata() {
		
	 Session s= getCon.con();
		  
		  Transaction t = s.beginTransaction();
		 product e = (product)s.get(product.class, 2);
		  s.delete(e);
		   
		  t.commit();
		  s.close();
		
	}

  public void getByAll() {
	System.out.println("Retrieving all the data");
	
	 Session s= getCon.con();

	  Query t =s.createQuery("from product");
	  List<product>data=t.list();
	  for(product p:data) {
		  System.out.println(p);
	  }
	  s.close();
	
}

}
