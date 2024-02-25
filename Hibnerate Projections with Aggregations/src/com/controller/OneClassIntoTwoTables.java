package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pojo.Address;
 

public class OneClassIntoTwoTables {
	
	
	public static void savemethod() {
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Address p = new Address("Hyd","srnagar","1234","scd","aa","1234");
		s.save(p);
		t.commit();
		s.close();
	}
	
	public static void GETBYID(int aid) {
		
		SessionFactory sf = GetSessionFactory.con();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Address l =(Address)s.get(Address.class, aid);
		System.out.println(l);
		
	}

	public static void main(String[] args) {
		 
		OneClassIntoTwoTables n = new OneClassIntoTwoTables();
		//n.savemethod();
		n.GETBYID(3);
		

	}

}
