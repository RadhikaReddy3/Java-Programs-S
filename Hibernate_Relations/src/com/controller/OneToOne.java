package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.pojo.*;

public class OneToOne {
	public void savedata() {
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		
		Person p = new Person();
		/*p.setPname("Ram");
		p.setPage(33);
		p.setPqual("B.Tech");*/
		p.setPname("Loki");
		p.setPage(47);
		p.setPqual("M.Tech");
		
		
		/*Passport q = new Passport();
		q.setPnum("AB123");
		q.setPexp("2060");
		p.setPpt(q);*/
		
		Passport q = new Passport();
		q.setPnum("B123Q");
		q.setPexp("2090");
		p.setPpt(q);
		
		r.save(p);
		
		t.commit();
		r.close();
		
	}
//GET BY ID
	public void getbyId(int pid) {
		Session r = getCon.con();
		
		Person p = (Person) r.get(Person.class, pid);
		System.out.println(p.getPid()+", "+p.getPage()+", "+p.getPqual()+", "+p.getPpt().getPnum()+", "+p.getPpt().getPexp());
		
	}
	
	//GETALL
	
	public void getAll() {
		Session r = getCon.con();
		
		Transaction t = r.beginTransaction();
		 Query q=r.createQuery("from Person");
		 
		 List<Person> data =q.list();
		 
		 for(Person p:data) {
			 System.out.println(p.getPid()+", "+p.getPage()+", "+p.getPqual()+", "+p.getPpt().getPnum()+", "+p.getPpt().getPexp());
		 }
		 
		
	}
	
	//UPDATE 
	
	public void update(int pid) {
		Session r = getCon.con();
		
		Transaction t = r.beginTransaction();
		Person p = (Person) r.get(Person.class, pid);
		p.setPname("klin");
		p.setPage(55);
		p.setPqual("MA");
		p.getPpt().setPexp("2045");
	    r.update(p);
	    
	    t.commit();
	    r.close();	
	}
	
	//DELETE
	
	public void delete() {
		Session r = getCon.con();
		
		Transaction t = r.beginTransaction();
		Person p = (Person) r.get(Person.class, 4);
	
	    r.delete(p);
	    
	    t.commit();
	    r.close();
	}
	public static void main(String[] args) {
		 OneToOne l = new OneToOne();
		 l.savedata();
		//l.getbyId(1);
	   //l.getAll();
	  // l.update(1);
	//l.delete();

	}

}
