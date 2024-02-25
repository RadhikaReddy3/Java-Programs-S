package com.addBatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.controller.jdbccon;

public class DaodataSaveOperation {

	 /*public void saveddata(List<employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  Connection con =jdbccon.getCon();
			 // con.setAutoCommit(false);
			   PreparedStatement ps= null;
			  for(employee emp:e) {
		      ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);");
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			  
			  ps.addBatch();
			  } 
			  int rows[]=ps.executeBatch();
			  for(int k:rows) {
				  System.out.println(k);
			  }
			  
			  con.close();
			}catch (Exception e2) {
			 System.out.println(e2);
		}
	 }*/
	
	
	/*public void saveddata(List<employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  Connection con =jdbccon.getCon();
			  
			   PreparedStatement ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);"); 
			  for(employee emp:e) {
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			  
			  ps.addBatch();
			  } 
			  int rows[]=ps.executeBatch();
			  for(int k:rows) {
				  System.out.println(k);
			  }
			  
			  con.close();
			}catch (Exception e2) {
			 System.out.println(e2);
		}
	
	
	
	
	 }*/

	
	public void saveddata(List<employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  Connection con =jdbccon.getCon();
			  
			   PreparedStatement ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);");
			   int i=1;
			  for(employee emp:e) {
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			  
			  ps.addBatch();
			   
			  if(i%5==0) {
				  ps.executeBatch();
				  System.out.println("I am executing 5 numbers batch");
				   
			  }
			  i=i+1;
			  }
			  con.close();
			}catch (Exception e2) {
			 System.out.println(e2);
		}
		  
	
	
	
	 }
	
	//TRANSACTIONS
	/*public void saveddata(List<employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  Connection con =jdbccon.getCon();
			  con.setAutoCommit(false);
			   PreparedStatement ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);");
			   int i=1;
			  for(employee emp:e) {
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			  
			  ps.addBatch();
			   
			  if(i%5==0) {
				  ps.executeBatch();
				  System.out.println("I am executing 5 numbers batch");
				   
			  }
			  i=i+1;
			  }
			  con.close();
			}catch (Exception e2) {
			 System.out.println(e2);
		}
		  
	
	
	
	 }*/

}
