package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import controller.getCon;
import pojo.passport;
import pojo.person;

import pojo.*;

public class OneToOne {
	
	public void savedata() {
		Session r = getCon.con();
		Transaction t = r.beginTransaction();
		
		person p = new person();
		 
		p.setPname("Lokesh");
		p.setPage(37);
		 
		
		
		 
		
		passport q = new passport();
		q.setPtnum("B123Q");
		q.setPexp("2070");
		q.setPer(p);
		
		r.save(q);
		
		t.commit();
		r.close();
		
	}
	public static void main(String[] args) {
		 
		OneToOne k = new OneToOne();
		k.savedata();

	}

}
