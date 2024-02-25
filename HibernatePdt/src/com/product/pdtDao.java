package com.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

 

public class pdtDao {

	 public void savedata(product em) {
			System.out.println("Saving the product data to database partially");
			// System.out.println(em);
			 
			  Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
			  SessionFactory sf =con.buildSessionFactory();
			  Session s=sf.openSession();
			  
			  Transaction t = s.beginTransaction();
			  s.save(em);
			  t.commit();
			  s.close();
		 }


}
