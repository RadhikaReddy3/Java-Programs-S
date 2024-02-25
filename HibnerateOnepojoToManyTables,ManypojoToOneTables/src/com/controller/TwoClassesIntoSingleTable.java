package com.controller;

import java.util.List;

import org.hibernate.Query;
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
	
	public static void getByName(String  oloc) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select a.oloc , k.tloc, k.tname from One a inner join a.to k where a.oloc =:oloc");
		p.setParameter("oloc",oloc);
		
		/*List<One> On =p.list();
		for(One em: On) {
			System.out.println(em);
		}*/
		
		List<Object[]> Onead =p.list();
		for(Object[] em: Onead) {
			System.out.println(em[0]+", "+em[1]+","+em[2]);
		}
		
	}
	public void updatedata(int oid)
	{
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	    One p =(One)s.get(One.class, oid);
	    p.setOname("cherry");
        
		Two p1 = new Two();
		 
		p1.setTloc("Delhi");
		p1.setTname("Tina");
		p.setTo(p1);
		
	    s.update(p);
	    t.commit();
		s.close();
		
}
	
	public void delete(int oid) {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		One p = (One) s.get(One.class, oid);
	    s.delete(p);
	    
	    t.commit();
	    s.close();
	}
	public void getByAll() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query q=s.createQuery("from One");
		List<One> o =q.list();

		for(One k:o) {
			System.out.println(k);
		}

		 
		}

	
 

	public static void main(String[] args) {
		TwoClassesIntoSingleTable h= new TwoClassesIntoSingleTable();
		//h.savemethod();
		//h.GETBYID(2);
		h.getByName("Hyd");
		//h.updatedata(2);
		//h.delete(3);
		//h.getByAll();
			 
			
		}

	}


