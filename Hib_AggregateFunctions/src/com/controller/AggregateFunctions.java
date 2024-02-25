package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AggregateFunctions {
	
	public static void OrderBy() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select e.eid, e.ename, e.esal from Employee e order by e.esal desc");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]);
		}
	}
	
	public static void Groupbyorderby() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal),edes from Employee group by edes order by max(esal) ");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]+", "+em[3]+", "+em[4]+", "+em[5]);
		}
	}
	 
	
	public static void Count() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*) from Employee e ");
		 
		List<Object[]> emp =p.list();
		System.out.println("Count of Records: "+emp);
		 
	}
	
	public static void Agg() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal) from Employee ");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println("Count: "+em[0]+", "+"Min sal: "+em[1]+", "+"Max sal: "+em[2]+", "+"Sum sal: "+em[3]+", "+"Avg sal: "+em[4]);
		}
	}
	
	public static void Groupby() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal),edes from Employee group by edes ");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]+", "+em[3]+", "+em[4]+", "+em[5]);
		}
	}
	
	public static void GroupbyandHaving() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal),edes from Employee group by edes having max(esal)> 50.0 order by edes");
		Query p1 =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal),edes from Employee group by edes having max(esal)> 50.0 order by max(esal)");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]+", "+em[3]+", "+em[4]+", "+em[5]);
		
      }
	}
	
	public static void OrderbyGroupbyandHaving() {
		SessionFactory sf = GetSessionFactory.con();
		Session s = sf.openSession();
		Query p =s.createQuery("select count(*), min(esal), max(esal), sum(esal), avg(esal),edes from Employee group by edes having edes = 'jd'  order by max(esal) ");
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]+", "+em[1]+", "+em[2]+", "+em[3]+", "+em[4]+", "+em[5]);
		}
	}

	public static void main(String[] args) {
		AggregateFunctions a = new AggregateFunctions();
		//a.OrderBy();
		//a.Count();
		//a.Agg();
		//a.Groupby();
		a.GroupbyandHaving();
		//a.OrderbyGroupbyandHaving();
		
		//a.Groupbyorderby();
	

	}

}
