package com.controller;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.*;

public class OneToOne {
	
	public static void savedata(Person p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(p);
		t.commit();
		s.close();
		 
		
	}
	
	public void updatedata(int pid)
	{
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	    Person p =(Person)s.get(Person.class, pid);
	    p.setPname("RAMA");
        
		
		Passport k = new Passport();
		k.setPnum("AB123D");
		k.setPexp("2027");
		p.setPpt(k);
	    s.update(p);
	    t.commit();
		s.close();
		
}
	/*
public void deletedata(int pid) {

SessionFactory sf = GetSessionFactory.con();
Session s = sf.openSession();
Transaction t = s.beginTransaction();
Person p =(Person)s.get(Person.class, pid);

s.delete(p);
t.commit();
s.close();
sf.close();

}*/
public void getById(int pid) {
SessionFactory sf = GetSessionFactory.con();
Session s = sf.openSession();
Person p=(Person)s.get(Person.class, pid);
System.out.println(p);

}
public void getById1(int pid) {
	SessionFactory sf = GetSessionFactory.con();
	Session d  = sf.openSession();
	Person p =(Person)d.get(Person.class, pid);
	System.out.println(p.getPid()+", "+p.getPname()+", "+p.getPage()+", "+p.getPqual());
	Passport k = p.getPpt();
	if(k!=null) {
		System.out.println(k);
		
	}
	else {
		System.out.println("No passport for"+p.getPname());
	}
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
		OneToOne t = new OneToOne();
		
		Person p =new Person();
		p.setPname("MANJULA");
		p.setPage(22);
		p.setPqual("MCA");
		
		 
		
		//t.savedata(p);
		
		//t.updatedata(1);
		
		//t.getById1(2);
		//t.getByAll();
	
		

	}

}