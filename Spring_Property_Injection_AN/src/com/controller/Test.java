package com.controller;
import com.pojo.Manager;

import com.pojo.TeamLead;

import java.lang.reflect.Field;

import com.pojo.Developer;
public class Test {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
	    Developer d = new Developer();
		TeamLead t = new TeamLead(); 
		Manager m = new Manager();
		
		Class p=t.getClass();
		Field tl=p.getDeclaredField("dev");
		tl.setAccessible(true);
		tl.set(t, d);
		
		Class j =m.getClass();
		Field ma=j.getDeclaredField("tl");
		ma.setAccessible(true);
		ma.set(m, t);
		m.doWork();
		

}
}