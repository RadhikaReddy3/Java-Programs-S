package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.*;

public class TwoClassesIntoSingleTable {
	
	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		One p = new One();
		p.setOloc("Hyd");
		p.setOname("Manju");
		Two q = new Two();
		q.setTname("Siva");
		q.setTloc("SCD");
		p.setTo(q);
		s.save(p);
		t.commit();
		s.close();
		
	}
	
	public static void GETBYID(int oid) {
		
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		
		One g =(One)s.get(One.class, oid);
		System.out.println(g);
		
		
	}
	
 

	public static void main(String[] args) {
		TwoClassesIntoSingleTable h= new TwoClassesIntoSingleTable();
		//h.savemethod();
		h.GETBYID(2); 
			 
			
		}

	}


