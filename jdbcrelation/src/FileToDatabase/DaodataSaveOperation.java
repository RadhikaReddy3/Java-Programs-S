package FileToDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.controller.jdbccon;

public class DaodataSaveOperation {

	/* public void saveddata(List<Employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  Connection con =jdbccon.getCon();
			  PreparedStatement ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);");
			  
			  for(Employee emp:e) {
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			 
			  
			  ps.addBatch();
			  } 
			  int[] row=ps.executeBatch();
			  System.out.println(row);
			  con.close();
			  
			}catch (Exception e2) {
			 System.out.println(e2);
		}
	 }*/
	
	 public void saveddata(List<Employee> e)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+e.size());
		  try {
			  
			  int i = 0;
			  Connection con =jdbccon.getCon();
			  PreparedStatement ps= con.prepareStatement("insert into relate.employee values(?,?,?,?);");
			  
			  for(Employee emp:e) {
		      ps.setInt(1, emp.getEid());
		      ps.setString(2, emp.getEname());
			  ps.setInt(3, emp.getEage());
			  ps.setDouble(4, emp.getEsal());
			 
			  
			  ps.addBatch();
			  
			  
			  if(i%5==0) {
				  System.out.println("I am executing 5 numbers Batch");
				  int[] row =ps.executeBatch();
				  
				  System.out.println(row);
			  }
			   i=i+1;
			  
			  } 
			  con.close();
			  
			}catch (Exception e2) {
			 System.out.println(e2);
		}
	 }

}
