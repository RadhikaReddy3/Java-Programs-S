package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.*;

public class ManyToMany {

	public void saveddata(Person p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(p);
		t.commit();
		s.close();
		
	}
	public void updatedata(int pid) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	    Person p =(Person)s.get(Person.class, pid);
	    p.setPname("Janaki");
	    
List<course> cou=new ArrayList<>();
		
		course c = new course();
		c.setCname("Java");
		c.setCfee(40.5);
		
		course c1 = new course();
		c1.setCname("Mysql");
		c1.setCfee(32.5);
		
		course c2 = new course();
		c2.setCname("Hib");
		c2.setCfee(52.5);
		
		cou.add(c);
		cou.add(c1);
		cou.add(c2);
		p.setCou(cou);
	     
	    
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
public void getById1(int pid) {
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Person p = (Person)s.get(Person.class, pid);
	System.out.println(p.getPid()+", "+p.getPname()+", "+p.getPage()+", "+p.getPqual());
	List<course> c = p.getCou();
	if(c!=null) {
		//System.out.println(c);
		for(course d: c) {
			System.out.println(d);
		}
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
          
		ManyToMany t = new ManyToMany();
		
		Person p =new Person();
		p.setPname("LAXMI");
		p.setPage(25);
		p.setPqual("MTECH");
		
		course m = new course();
		m.setCname("JAVA");
		m.setCfee(30.5);
		
		course m1 = new course();
		m1.setCname("AWS");
		m1.setCfee(40.5);
		
		course m2 = new course();
		m2.setCname("HIB");
		m2.setCfee(50.5);
		
		List<course> cou = new ArrayList<>();
		cou.add(m);
		cou.add(m1);
		cou.add(m2);
		
		p.setCou(cou);
		
		//t.saveddata(p);
		t.updatedata(1);
		//t.getById1(4);
		//t.getByAll();
		

	}

}
