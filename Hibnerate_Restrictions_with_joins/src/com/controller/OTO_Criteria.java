package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;

public class OTO_Criteria {

	public static void main(String[] args) {
	 
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Criteria c =s.createCriteria(Person.class, "p");
	    c.createAlias("p.ppt", "pt");
	    c.add(Restrictions.eq("pt.pnum","sder123"));
	    
		
		/*Criteria c =s.createCriteria(Person.class, "p");
	    c.createAlias("p.ppt", "pt");
	    c.add(Restrictions.eq("p.pname","klin"));*/
	    List<Person> data = c.list();
	    for(Person n: data) {
	    	System.out.println(n);
	    }
	    

	}

}
