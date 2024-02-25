package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pojo.*;

public class OneToOne {
	
	public static void Joins(int pid) {
		Session r = getCon.con(); 
		Query p =r.createQuery("from Person p inner join p.ppt   where p.pid=:pid");
		p.setParameter("pid", pid);
		 
		List<Object[]> emp =p.list();
		for(Object[] em: emp) {
			System.out.println(em[0]);
		}
	}
	
	public static void Joinsbyselect() {
		Session r = getCon.con(); 
		Query p =r.createQuery("select p.pid, p.pname, pt.pnum, pt.pexp from Person p inner join p.ppt pt");
		 
		 
		List<Object[]> l =p.list();
		for(Object[] pe: l) {
			 
			Integer e =(Integer)pe[0];
			String s = (String)pe[1];
			String g = (String)pe[2];
			String h = (String)pe[3];
			System.out.println(e+", "+s+", "+g+", "+h); 
			
		}
	}
	public static void main(String[] args) {
		 OneToOne l = new OneToOne();
		 
         //l.Joins(2); /*It is not using by using select*/
         l.Joinsbyselect();/*It is using by using select*/
	}

}
