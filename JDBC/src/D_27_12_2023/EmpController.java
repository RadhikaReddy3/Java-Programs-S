package D_27_12_2023;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpController {
	
	public static Connection getCon() {
		Connection con = null;
		  try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
		   
		return con;
	}
	
	public void savedata(EmpPojo emp) throws SQLException {
		
		Connection con =EmpController.getCon();
		PreparedStatement ps = con.prepareStatement("insert into apple.emp values(?,?,?,?)");
		ps.setInt(1, emp.getEid());
		ps.setString(2, emp.getEname());
		ps.setDouble(3, emp.getEsal());
		ps.setString(4,emp.getEdes());
		int k =ps.executeUpdate();
		
		System.out.println("No. of Rows inserted: "+k);
		
	}
	
	
	public void updatedata(int eid, String ename,double esal ) throws SQLException {
		Connection con =EmpController.getCon();
		PreparedStatement ps =con.prepareStatement("update apple.emp set ename =?, esal=? where(eid =?)");
		 
		ps.setString(1,ename); 
		ps.setDouble(2,esal);
		ps.setInt(3,eid);
		int p = ps.executeUpdate();
		System.out.println("No.Of Rows Updated: "+p);
	}
	
	
	
	public void deletedata(int eid) throws SQLException {
		Connection con =EmpController.getCon();
		PreparedStatement ps =con.prepareStatement("delete from apple.emp where (eid =?)");
		 
		 
		ps.setInt(1,eid);
		int p = ps.executeUpdate();
		System.out.println("No.Of Rows Deleted: "+p);
		
	}
	
	
	public void getById(int eid) throws SQLException{
		Connection con =EmpController.getCon();
		PreparedStatement ps =con.prepareStatement("select*from apple.emp where eid >=?");
		 
		 
		ps.setInt(1,eid);
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			//System.out.println("hi");
			int empid = rs.getInt("eid");
			String empname = rs.getString("ename");
			double empsal =rs.getDouble("esal");
			String empdes= rs.getString("edes");
			
		    System.out.println("Employee Id: "+empid);
			System.out.println("Employee Name: "+empname);
			System.out.println("Employee sal: "+empsal);
			System.out.println("Employee Designation: "+empdes);
			System.out.println("---------Next Employee Details-----------");
			}
			
		}
		//System.out.println("No.Of Rows retrieved: "+rs);
		public EmpPojo getbyId(int eid) throws SQLException{
			Connection con =EmpController.getCon();
			PreparedStatement ps =con.prepareStatement("select eid , ename from apple.emp where eid =?");
			 
			 
			ps.setInt(1,eid);
			ResultSet rs =ps.executeQuery();
			EmpPojo t = new EmpPojo();
			while(rs.next()) {
				
				t.setEid(rs.getInt("eid"));
				t.setEname(rs.getString("ename"));
				/*t.setEsal(rs.getDouble("esal"));
				t.setEdes(rs.getString("edes"));*/
				
				System.out.println("next row data");
			 
			}
			 return t;
	}
		
		public static ArrayList<EmpPojo> getAll() throws SQLException{
			Connection con =EmpController.getCon();
			PreparedStatement ps =con.prepareStatement("select*from apple.emp;");
			 
			ResultSet rs =ps.executeQuery();
			ArrayList<EmpPojo> l =new ArrayList<>();
			 
			while(rs.next()) {
				EmpPojo t = new EmpPojo();
				t.setEid(rs.getInt("eid"));
				t.setEname(rs.getString("ename"));
				t.setEsal(rs.getDouble("esal"));
				t.setEdes(rs.getString("edes"));
				l.add(t);
			 
			}
			 return l;
	}


}
