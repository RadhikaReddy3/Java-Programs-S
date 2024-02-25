package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Passport;
import com.pojo.Person;
import com.pojo.course;
import com.pojo.mobile;

public class All {

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
	    p.setPname("Chinna");
	    
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
Query q=s.createQuery("from Person");
List<Person> per =q.list();

for(Person k:per) {
	System.out.println(k);
}

 
}
public static void getByAll2() {
	
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Query q=s.createQuery("from Person p");
	List<Person> pers =q.list();
	{
		for(Person p:pers) {
			 if(p!=null&&p.getPpt()!=null&&!(p.getMob().isEmpty()&&p.getCou().isEmpty())) {
				 
				 System.out.println(p+"\n"+p.getPpt()+"\n"+p.getMob()+"\n"+p.getCou());
				 
				 
				 
			 }
		}
	}
	
}
public static void getByAll1() {
	
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Query q=s.createQuery("from Person p");
	List<Person> pers =q.list();
    for(Person g: pers) {
    	System.out.println(g);
    	
    	if(g.getPpt()!=null) {
    		System.out.println(g.getPpt());
    	}
    	else {
    	 System.out.println("No passport");
    	}
    	
    	if(g.getMob().isEmpty()) {
    		
    		System.out.println("No Mobile");
    	}else {
    		
    		 
    		for(mobile mo:g.getMob()) {
    			System.out.println(mo);
    		}
    		
    		if(g.getCou().isEmpty()) {
    			System.out.println("No Course");
    		}
    		else {
    			for(course co:g.getCou()) {
        			System.out.println(co);
        		}
    		}
    		
    		 
    	}
    	
    	 
    	 
    }
	
}

public void getById1(int pid) {
	SessionFactory sf = GetSessionFactory.con();
	Session s = sf.openSession();
	Person p = (Person)s.get(Person.class, pid);
	System.out.println(p.getPid()+", "+p.getPname()+", "+p.getPage()+", "+p.getPqual());
	
	Passport k = p.getPpt();
	if(k!=null) {
		System.out.println(k);
		
	}
	else {
		System.out.println("No passport for"+p.getPname());
	}
	
	List<mobile> m = p.getMob();
	if(m!=null) {
		System.out.println(m);
		for(mobile l:m) {
		System.out.println(l);
		}
	}
		else {
			System.out.println("No mobile");
		
		}
		
		
	List<course> c = p.getCou();
	if(c!=null) {
		//System.out.println(c);
		for(course d: c) {
			System.out.println(d);
		}
	}
	else {
		System.out.println("No courses ");
	}
	}


	public static void main(String[] args) {
          
	 All t = new All();
		
		Person p =new Person();
		p.setPname("SITA");
		p.setPage(24);
		p.setPqual("MCOM");
		
		Passport q = new Passport();
		q.setPnum("AB123Z");
		q.setPexp("3090");
		p.setPpt(q);
		
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
		
		 
		
		course m3 = new course();
		m3.setCname("Python");
		m3.setCfee(30.5);
		
		course m4 = new course();
		m4.setCname("C");
		m4.setCfee(40.5);
		
		course m5 = new course();
		m5.setCname("C++");
		m5.setCfee(50.5);
		
		List<course> cou = new ArrayList<>();
		cou.add(m3);
		cou.add(m4);
		cou.add(m5);
		
		p.setCou(cou);
		
		  //t.saveddata(p);
         //t.updatedata(3);
		//t.getById(3);
	    t.getByAll1();
		//t.getByAll2();
	   //t.getById1(5);
	}


}
