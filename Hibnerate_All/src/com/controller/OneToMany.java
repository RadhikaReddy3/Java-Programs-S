package com.controller;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Person;
import com.pojo.*;

public class OneToMany {
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
	    p.setPname("Cherry");
	    
	    
	    mobile m = new mobile();
		m.setMsim("jio");
		m.setMnum(986645342l);
		
		mobile m1 = new mobile();
		m1.setMsim("Airtel");
		m1.setMnum(9786645342l);
		
		mobile m2 = new mobile();
		m2.setMsim("bsnl");
		m2.setMnum(954645342l);
		
		List<mobile> mob = new ArrayList<>();
		mob.add(m);
		mob.add(m1);
		mob.add(m2);
		
		p.setMob(mob);
	    
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
	Session s= sf.openSession();
	Person p= (Person)s.get(Person.class, pid);
	System.out.println(p.getPid()+", "+p.getPname()+", "+p.getPage()+", "+p.getPqual());
	List<mobile> m = p.getMob();
	if(m!=null) {
		System.out.println(m);
		for(mobile l:m) {
		System.out.println(l);
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
     OneToMany t = new OneToMany();
		
		Person p =new Person();
		p.setPname("Lucky");
		p.setPage(23);
		p.setPqual("BCA");
		
		mobile m = new mobile();
		m.setMsim("jio");
		m.setMnum(986645342l);
		
		mobile m1 = new mobile();
		m1.setMsim("Airtel");
		m1.setMnum(9786645342l);
		
		mobile m2 = new mobile();
		m2.setMsim("bsnl");
		m2.setMnum(954645342l);
		
		List<mobile> mob = new ArrayList<>();
		mob.add(m);
		mob.add(m1);
		mob.add(m2);
		
		p.setMob(mob);
		
		//t.saveddata(p);
		//t.updatedata(3);
		//t.getById(4);
		//t.getByAll();
		t.getById1(3);
		 

	}

}
