package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

 import com.pojo.*;

public class OneToMany {

	public void savedata() {
		Session g = getCon.con();
		Transaction t = g.beginTransaction();
		
		Person p = new Person();
		p.setPname("siva");
		p.setPage(300);
		p.setPqual("BCA");
		
		/*Passport q = new Passport();
		q.setPnum("AB123C");
		q.setPexp("2056");
		p.setPpt(q);*/
		
		List<mobile> mo = new ArrayList<>();
		mo.add(new mobile(9274881973l,"dcomo"));
		mo.add(new mobile(7626157831l,"idea"));
		mo.add(new mobile(67365378168l,"Jio"));
		p.setMob(mo);
		
		
		
		g.save(p);
		t.commit();
		g.close();
	}
	
	public void getbyId(int pid) {
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		
		Person k =(Person)r.get(Person.class, pid);
		System.out.println(k.getPid()+","+k.getPname()+","+k.getPqual());
		
		Passport m=k.getPpt();
		if( m !=null) {
			
			System.out.println(m.getPpid()+","+m.getPnum()+","+m.getPexp());
			
		}
		
		else {
			System.out.println("No Passport");
		}
		
		List<mobile> mo = k.getMob();
		if(mo!=null) {
			for(mobile mob:mo) {
				System.out.println(mob.getMid()+","+mob.getMnum()+","+mob.getMsim());
			}
		}
		else {
			System.out.println("No Mobile");
		}	
	}
	
	public void getAll() {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		Query d =r.createQuery("from Person");
		List<Person>data =d.list();
		
		for(Person k:data) {
			System.out.println(k.getPid()+","+k.getPname()+","+k.getPqual());
			
			Passport m=k.getPpt();
			if( m !=null) {
				
				System.out.println(m.getPpid()+","+m.getPnum()+","+m.getPexp());
				
			}
			
			else {
				System.out.println("No Passport");
			}
			
			List<mobile> mo = k.getMob();
			if(mo!=null&& !mo.isEmpty()) {
				for(mobile mob:mo) {
					System.out.println(mob.getMid()+","+mob.getMnum()+","+mob.getMsim());
				}
			}
			else {
				System.out.println("No Mobile");
			}	
		}
		 
	}
	
	public void update(int pid) {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Person p=(Person)r.get(Person.class, pid);
		List<mobile> mob =p.getMob();
		for(mobile mo: mob) {
			if(mo.getMsim().equals("airtel")) {
				
				 mo.setMnum(765432197l);
			}
		}
		r.update(p);
		t.commit();
		r.close();
	}
	
	public void delete(int pid) {
		Session r = getCon.con();
		Transaction t=r.beginTransaction();
		
		Person p=(Person)r.get(Person.class, pid);
		 
		r.delete(p);
		t.commit();
		r.close();
	}

	public static void main(String[] args) {
		 OneToMany j = new OneToMany();
		 j.savedata();
		 //j.getbyId(1);
		 //j.getAll();
		 //j.update(1);
		 //j.delete(6);
		 

	}

}
