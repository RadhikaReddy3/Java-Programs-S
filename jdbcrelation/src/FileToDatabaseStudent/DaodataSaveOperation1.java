package FileToDatabaseStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.controller.jdbccon;

public class DaodataSaveOperation1 {

	 public void saveddata(List<Student> st)
	 {
		 //System.out.println(e);
		 System.out.println("Size: "+st.size());
		  try {
			  Connection con =jdbccon.getCon();
			  
			  for(Student stu:st) {
			  PreparedStatement ps= con.prepareStatement("insert into relate.Student values(?,?,?,?);");
		      ps.setInt(1, stu.getSid());
		      ps.setString(2, stu.getSname());
			  ps.setInt(3, stu.getSage());
			  ps.setDouble(4, stu.getSmarks());
			  
			  ps.executeUpdate();
			  } 
			  con.close();
			}catch (Exception e2) {
			 System.out.println(e2);
		}
	 }

}
