package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Person;
import com.pojo.mobile;

public class MTO {

	public void saveddata(Person p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(p);
		t.commit();
		s.close();
		
	}
	public static void main(String[] args) {
      MTO t = new MTO();
		
		Person p =new Person();
		p.setPname("Lucky");
		p.setPage(23);
		p.setPqual("BCA");
		
		mobile m = new mobile();
		m.setMsim("jio");
		m.setMnum(986645342l);
	    m.setPm(p);
		
		mobile m1 = new mobile();
		m1.setMsim("Airtel");
		m1.setMnum(9786645342l);
		m1.setPm(p);
		
		mobile m2 = new mobile();
		m2.setMsim("bsnl");
		m2.setMnum(954645342l);
		m2.setPm(p);
		
		List<mobile> mob = new ArrayList<>();
		mob.add(m);
		mob.add(m1);
		mob.add(m2);
		
		
		p.setMob(mob);
		
		t.saveddata(p);
		

	}

}
