package com.controller;
import com.pojo.Manager;

import com.pojo.TeamLead;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.pojo.Developer;
public class Test {
	
	public static void main(String[] args) {
		
	    Developer d = new Developer();
		TeamLead t = new TeamLead(); 
 		Manager m = new Manager();
		
		Class p=t.getClass();
		Field[] k =p.getDeclaredFields();
		for(Field l :k) {
		System.out.println("TeamLead Fields: "+l.getName());
		 
		}
		System.out.println("----------------------------------------");
		
		Class l=m.getClass();
		Field[] o =l.getDeclaredFields();
		for(Field f :o) {
		System.out.println("Manager Fields: "+f.getName());
		}
		System.out.println("---------------------------------------");
		Class a=t.getClass();
		Method[] b =a.getDeclaredMethods();
		for(Method c :b) {
		System.out.println("TeamLead Methods: "+c.getName());
		}
		System.out.println("---------------------------------------");
		
		Class e=m.getClass();
		Method[] f =e.getDeclaredMethods();
		for(Method g :f) {
		System.out.println("Manager Methods: "+g.getName());
		}
		System.out.println("---------------------------------------");
		
		
		Class h=t.getClass();
		Annotation[] v =h.getDeclaredAnnotations();
		for(Annotation g :v) {
		System.out.println("TeamLead Annotations: "+g);
		}
		Class h1=m.getClass();
		Annotation[] v1 =h1.getDeclaredAnnotations();
		
		System.out.println("------------------------------------------");
		for(Annotation g :v1) {
		System.out.println("Manager Annotations: "+g);
		}
		

}
}