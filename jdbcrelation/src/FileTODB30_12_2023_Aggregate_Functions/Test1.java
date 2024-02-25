package FileTODB30_12_2023_Aggregate_Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class Test1 {
	
	public List<Employee> countdata() throws Exception{
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/relate", "root", "root");
		PreparedStatement ps = con.prepareStatement("select max(esal),min(esal),avg(esal),sum(esal)from relate.employee");
		List<Employee> l = new ArrayList<>();
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setMaxesal(rs.getDouble(1));
			emp.setMinsal(rs.getDouble(2));
			emp.setAvgsal(rs.getDouble(3));
			emp.setSumsal(rs.getDouble(4));
			
			/*emp.setEid(rs.getInt("eid"));
			emp.setEname(rs.getString("ename"));
		    emp.setEsal(rs.getDouble("esal"));
			emp.setEdesg(rs.getString("edesg"));*/
			l.add(emp);// It is used when we used groupby, orderby
		}
		return l;
	}

	public static void main(String[] args) throws Exception {
		 
         Test1 t = new Test1();
         List<Employee> p = t.countdata();
         for (Employee emp : p) {
             System.out.println("Max Salary: " + emp.getMaxesal());
             System.out.println("Min Salary: " + emp.getMinsal());
             System.out.println("Avg Salary: " + emp.getAvgsal());
             System.out.println("Sum Salary: " + emp.getSumsal());
         }
	}

}
