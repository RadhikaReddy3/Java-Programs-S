package com.controller;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.*;


import com.pojo.slkstd;

public class Test {
	
	public static ArrayList<slkstd> readfile()  {
		
		ArrayList<slkstd> stdd  = new ArrayList();
		try {
			FileReader fr = new FileReader("E:\\Slokam Files\\slkstddata.txt");
			BufferedReader br = new BufferedReader(fr);
			
			for(String s = br.readLine(); s!=null;s = br.readLine()) {
				
				String[] n = s.split(",");
				
				slkstd std = new slkstd();
				std.setSid(Integer.parseInt(n[0]));
				std.setSname(n[1]);
				std.setSage(Integer.parseInt(n[2]));
				std.setSqual(n[3]);
				std.setSmarks(Double.valueOf(n[4]));
				stdd.add(std);
				 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdd;
		
	}

	public static void main(String[] args) {
		ArrayList<slkstd> dd=Test.readfile();
		 
		SessionFactory s=GetSessionFactory.con();
		Session ss= s.openSession();
	    Transaction t=	ss.beginTransaction();
	int i=1;
	for (slkstd sl : dd) {
		System.out.println(sl);
		ss.save(sl);
		if(i%5==0) {
		ss.flush();	
		}
		i++;
	}
	
	t.commit();
	s.close();
		 

	}

}
