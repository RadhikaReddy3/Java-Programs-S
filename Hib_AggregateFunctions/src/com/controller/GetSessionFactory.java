package com.controller;

 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class GetSessionFactory {

 
		 
		public static SessionFactory con() { 
			
			  Configuration con = new AnnotationConfiguration().configure();
			  SessionFactory sf =con.buildSessionFactory();
			   
		      return sf;
		}
	}


