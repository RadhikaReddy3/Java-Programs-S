package com.controller;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.pojo.*;
public class unitperson {
	public void savedata() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
	    Transaction t=	s.beginTransaction();
	    Person p = new Person();
	    p.setPname("RAM");
	    p.setPage(21);
	    p.setPqual("B.TECH");
	    
	    s.save(p);
	    
	    
	    t.commit();
		s.close();
		sf.close();
		
	}
	 
 public void updatedata(int pid) {
			SessionFactory sf = GetSessionFactory.con();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
		    Person p =(Person)s.get(Person.class, pid);
		    p.setPname("SRIRAMA");
		    
		    s.update(p);
		    t.commit();
			s.close();
			sf.close();
			
		}
public void deletedata(int pid) {
	
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
    Person p =(Person)s.get(Person.class, pid);
    
    s.delete(p);
    t.commit();
	s.close();
	sf.close();
	
}
public void getById(int pid) {
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
    Person p=(Person)s.get(Person.class, pid);
    System.out.println(p);
	
}
public void getByAll() {
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	Query q=s.createQuery("from Person");
	List<Person> per =q.list();
	
	for(Person k:per) {
		System.out.println(k);
	}
     
	
}

	public static void main(String[] args) {
		 unitperson t = new unitperson();
		 //t.savedata();
		 //t.updatedata(1);
		 //t.deletedata(4);
		 //t.getById(1);
		 //t.getByAll();

	}

}
