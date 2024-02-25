package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;

public class MTM_Criteria {

	public static void main(String[] args) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
	    Criteria c =s.createCriteria(Person.class, "p");
	    c.createAlias("p.cou", "c");
	    c.add(Restrictions.eq("p.pname","CCC"));
	    
	
		//ManyTOMany
		/*Criteria c =s.createCriteria(Person.class, "p");
	    c.createAlias("p.cou", "c");
	    c.add(Restrictions.eq("c.cname","Java"));*/
	    List<Person> data = c.list();
	    for(Person n: data) {
	    	System.out.println(n);
	    }
	    

	}

}
