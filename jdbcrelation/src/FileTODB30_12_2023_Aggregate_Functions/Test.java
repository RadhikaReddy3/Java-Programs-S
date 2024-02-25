package FileTODB30_12_2023_Aggregate_Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Test {

 
		public ArrayList<Employee> countdata() throws Exception{
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relate","root", "root");
					PreparedStatement ps = con.prepareStatement("select count(*) from relate.employee;");
					ArrayList<Employee> a = new ArrayList<>();
					ResultSet rs = ps.executeQuery();
					 while(rs.next()) {
				            int count = rs.getInt(1);
				            System.out.println("Count of records in employee table: " + count);
				        }
				        con.close(); 
					return a;
				}
			public static void main(String[] args) throws Exception {
					Test t = new Test();
					ArrayList<Employee> h = t.countdata();
					System.out.println(h);

	}

}

 