package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Person;
import com.pojo.course;

public class MTM {

	
	public void saveddata(course p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(p);
		t.commit();
		s.close();
		
	}
	public static void main(String[] args) {
         MTM j = new MTM();
         
		
		 
		
		course m = new course();
		m.setCid(1);
		m.setCname("JAVA");
		m.setCfee(30.5);
		
	    Person h = new Person();
	    h.setPname("AAA");
	    h.setPage(21);
	    h.setPqual("BTECH");
	    
	    Person h1 = new Person();
	    h1.setPname("BBB");
	    h1.setPage(22);
	    h1.setPqual("MTECH");
	    
	    Person h2 = new Person();
	    h2.setPname("CCC");
	    h2.setPage(23);
	    h2.setPqual("MCA");
		
		List<Person> per = new ArrayList<>();
		per.add(h);
		per.add(h1);
		per.add(h2);
		
		m.setPer(per);
		
		j.saveddata(m);
		//t.updatedata(1);
		//t.getById1(4);
		//t.getByAll();
	}

}
