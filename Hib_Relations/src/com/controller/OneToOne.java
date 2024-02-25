package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import com.pojo.*;

public class OneToOne {

	public static void main(String[] args) {
		Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
 
		  
		  person p = new person();
		  p.setPid(1);
		  p.setPname("Ram");
		  p.setPmarks(567.5);
		  
		  passport d = new passport();
		  d.setPpid(1);
		  d.setPnum("ABC23K");
		  d.setPexpdate("2027");
		  
		  p.setPasp(d);
		s.save(d);  
		s.save(p);
		t.commit();
		s.close();
		
		sf.close();
		

	}

}

