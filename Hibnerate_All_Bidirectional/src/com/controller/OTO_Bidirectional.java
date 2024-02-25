

package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Passport;
import com.pojo.Person;

public class OTO_Bidirectional {
	
	public static void savedata(Passport p) {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(p);
		t.commit();
		s.close();
		 
		
	}

	public static void main(String[] args) {
		 
		OTO_Bidirectional l = new OTO_Bidirectional();
		Passport pt = new Passport();
		pt.setPpid(1);
		pt.setPnum("sder123");
		pt.setPexp("2025");
		
		Person k = new Person();
		//k.setPid(1);
		k.setPname("klin");
		k.setPage(55);
		k.setPqual("MCA");
		k.setPpt(pt);
		pt.setPers(k);
		l.savedata(pt);
	}

}
