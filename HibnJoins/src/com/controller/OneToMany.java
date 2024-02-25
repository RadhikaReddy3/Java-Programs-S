package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pojo.Person;

public class OneToMany {

	public static void join() {	
		
		String query = "select p.pname, p.page, p.pqual, h.mnum, h.msim from Person p inner join p.mob h where p.pname='Janaki'";
		//[Many To One] 
		//String query = "select p.pname, p.page, p.pqual, h.mnum, h.msim from Person p inner join p.mob h where h.msim ='Jio'";
		Session f = getCon.con();
		Query p=f.createQuery(query);
		List<Object[]>l=p.list();
		
		for(Object[] d: l) {
			System.out.println(d[0]+"---"+d[1]+"---"+d[2]+"---"+d[3]+"---"+d[4]);
			
		}
		
		
		
	}
	 

	public static void main(String[] args) {
		 
            OneToMany k = new OneToMany();
            k.join();
             
            
            
	}
}
