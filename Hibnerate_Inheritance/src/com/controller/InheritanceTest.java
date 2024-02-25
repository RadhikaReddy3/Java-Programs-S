package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pojo.*;

public class InheritanceTest {
	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		 
		 Employee h = new Employee();
		 h.setUid(1);
		 h.setEloc("HYD");
		 h.setEname("SIVA");
		 h.setUloc("SCD");
		 h.setUname("RAM");
		 
		 Customer j = new Customer();
		 j.setUid(2);
		 j.setCloc("ZHB");
		 j.setCname("ROSY");
         j.setUloc("KTB");
         j.setUname("LILLY");
		s.save(h);
		s.save(j);
		t.commit();
		s.close();
		 	
	}
	public static void main(String[] args) {
		 InheritanceTest n = new InheritanceTest();
		 n.savemethod();
		 

	}

}
