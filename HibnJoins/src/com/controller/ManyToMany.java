package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ManyToMany {

	public static void join() {	
		  
		String query = "select p.pname, p.page, p.pqual, h.cname, h.cfee from Person p inner join p.cou h where h.cname ='Java'";
		//String query = "select p.pname, p.page, p.pqual, h.cname, h.cfee from Person p inner join p.cou h where p.pname ='Janaki'";
		Session f = getCon.con();
		Query p=f.createQuery(query);
		List<Object[]>l=p.list();
		
		for(Object[] d: l) {
			System.out.println(d[0]+"---"+d[1]+"---"+d[2]+"---"+d[3]+"---"+d[4]);
			
		}	
		
	}
	public static void main(String[] args) {
		 
            ManyToMany k = new ManyToMany();
            k.join();         

}}

