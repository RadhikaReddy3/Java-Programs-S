package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class stuDao {

	 public void savedata(student s) {
		 System.out.println("Saving data to database---");
		 Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		 SessionFactory sf =con.buildSessionFactory();
		 Session se =sf.openSession();
		 Transaction t=se.beginTransaction();
		 se.save(s);
		 t.commit();
		 se.close();
	 }

}
