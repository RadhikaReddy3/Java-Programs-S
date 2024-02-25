package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class getCon {
	
	public static Session con() { 
	
	  Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
	  SessionFactory sf =con.buildSessionFactory();
	  Session s=sf.openSession();
      return s;
}
}
