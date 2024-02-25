package com.controller;
import java.util.ArrayList;
import com.pojo.employee;

public class Test {
	 public employee getbyId()
	 {
		 employee e1 = new employee(104,"siva",34,6567.89,"se");
		 return e1;
	 }
	 public ArrayList<employee> getAll() 
	 {
		 employee e1 = new employee(104,"siva",34,6567.89,"se");
		ArrayList<employee> k = new ArrayList<>();
		k.add(new employee(101,"Mahi",19,56645.78,"se"));
		k.add(new employee(102,"shyam",21,56645.78,"se"));
		k.add(new employee(103,"ram",23,56645.78,"se"));//This is one way of giving data(Here only we created constructor)
		k.add(e1);//This is one way of giving data(We previously created constructor and inserted in to method)
	   
		return k;
	 }
	 public static void main(String[] args) {
		 Test t = new Test();
		 employee emp =t.getbyId();System.out.println(emp.getEid()+"\n"+emp.getEname()+"\n"+emp.getEage()+"\n"+emp.getEdes()+"\n"+emp.getEsal()+"\n"+emp.getEdes());
		 
		 ArrayList<employee> data=t.getAll();
		 //System.out.println(data);
		 //System.out.println(data.size());
		 
		 /*System.out.println(data.get(0).getEid());
		 System.out.println(data.get(1).getEid());//only first value it prints
		 System.out.println(data.get(2).getEid());
		 System.out.println(data.get(3).getEid());*/
		 //The above is not correct way
		 
		 
		 for(int i=0;i<=data.size()-1;i++) {
			 System.out.println(data.get(i).getEid()+"---"+data.get(i).getEname()+"---"+data.get(i).getEage()+"---"+data.get(i).getEsal()+"---"+data.get(i).getEdes());
			
			 
			 
		 
		 }
		 
		 
		 FileDao v = new FileDao();
		employee e= v.getbyId(101);
		System.out.println("\n\n\n"+"File DAO CLASS CODE"+e.getEid()+"\n"+e.getEname()+"\n"+e.getEage()+"\n"+e.getEdes()+"\n"+e.getEsal()+"\n"+e.getEdes());
		
		ArrayList<employee> k=v.getAll();
		//System.out.println(k);
		for(int i=0;i<=k.size()-1;i++) {
			 System.out.println(k.get(i).getEid()+"---"+k.get(i).getEname()+"---"+k.get(i).getEage()+"---"+k.get(i).getEsal()+"---"+k.get(i).getEdes());
			
	 }
	 

}}
