package com.controller;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetSessionFactory {	 
		public static SessionFactory con() { 
			
			  Configuration con = new AnnotationConfiguration().configure();
			  SessionFactory sf =con.buildSessionFactory();
			   
		      return sf;
		}
	}


