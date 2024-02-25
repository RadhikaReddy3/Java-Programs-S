package com.controller;

import java.util.List;
import java.util.HashSet;

import org.hibernate.Query;
import org.hibernate.Session;

public class All {
	
	public static void join() {	
		 
		 
		String query = "select p.pname, p.page, p.pqual,t.pnum, t.pexp,m.mnum, m.msim, h.cname, h.cfee from Person p inner join p.ppt t inner join p.mob m inner join p.cou h where p.pname ='Janaki'";
		Session f = getCon.con();
		Query p=f.createQuery(query);
		List<Object[]>l=p.list();
		
		
		HashSet<String> k = new HashSet<>();
		HashSet<String> k1 = new HashSet<>();
		HashSet<String> k2 = new HashSet<>();
		
		
		for(Object[] d: l) 
		{
		  k.add(d[0]+"---"+d[1]+"---"+d[2]+"-Person Passport--"+d[3]+"---"+d[4]);
			
		}
		
		for(Object[] d: l) 
		{
			  k1.add(d[5]+"-Mobile--"+d[6]);
				
			}
		
		for(Object[] d: l) 
		{
			   k2.add(d[7]+"-course--"+d[8]);
				
			}
		
		
		System.out.println(k);
		System.out.println(k1);
		System.out.println(k2);
		
		HashSet<Object> n = new HashSet<>();
		n.add(k);
		n.add(k1);
		n.add(k2);
		System.out.println(n);
		
		
		
	}
	public static void main(String[] args) {
		 
            All k = new All();
            k.join();
             

}
}
