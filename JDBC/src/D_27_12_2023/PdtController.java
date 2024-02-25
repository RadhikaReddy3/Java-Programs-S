package D_27_12_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PdtController {
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
	
	public static void savedata(PdtPojo pdt) throws SQLException {
		
		Connection con =PdtController.getCon();
		PreparedStatement ps = con.prepareStatement("insert into apple.Pdt values(?,?,?,?)");
		ps.setInt(1, pdt.getPid());
		ps.setString(2, pdt.getPname());
		ps.setDouble(3, pdt.getPprice());
		ps.setBoolean(4,pdt.isPd());
		int k =ps.executeUpdate();
		
		System.out.println("No. of Rows inserted: "+k);
		
	}
	
	
	public static void updatedata(int pid, String pname,double pprice ) throws SQLException {
		Connection con = PdtController.getCon();
		PreparedStatement ps =con.prepareStatement("update apple.Pdt set pname =?, pprice=? where(pid =?)");
		 
		ps.setString(1,pname); 
		ps.setDouble(2,pprice);
		ps.setInt(3,pid);
		int p = ps.executeUpdate();
		System.out.println("No.Of Rows Updated: "+p);
	}
	
	
	
	public static void deletedata(int pid) throws SQLException {
		Connection con = PdtController.getCon();
		PreparedStatement ps =con.prepareStatement("delete from apple.Pdt where (pid =?)");
		  
		ps.setInt(1,pid);
		int p = ps.executeUpdate();
		System.out.println("No.Of Rows Deleted: "+p);
		
	}
	
	
	public static void getById(int pid) throws SQLException{
		Connection con = PdtController.getCon();
		PreparedStatement ps =con.prepareStatement("select*from apple.Pdt where pid =?");
		 
		 
		ps.setInt(1,pid);
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			//System.out.println("hi");
			int Pdtid = rs.getInt("pid");
			String Pdtname = rs.getString("pname");
			double Pdtprice =rs.getDouble("pprice");
			boolean Pd= rs.getBoolean("pd");
			
		    System.out.println("Employee Id: "+Pdtid);
			System.out.println("Employee Name: "+Pdtname);
			System.out.println("Employee sal: "+Pdtprice);
			System.out.println("Employee Designation: "+Pd);
			System.out.println("---------Next Product Details-----------");
			}
			
		}
		//System.out.println("No.Of Rows retrieved: "+rs);
		public static PdtPojo getbyId(int pid) throws SQLException{
			Connection con = PdtController.getCon();
			PreparedStatement ps =con.prepareStatement("select*from apple.Pdt where pid =?");
			 
			 
			ps.setInt(1,pid);
			ResultSet rs =ps.executeQuery();
			PdtPojo t = new PdtPojo();
			while(rs.next()) {
				
				t.setPid(rs.getInt("pid"));
				t.setPname(rs.getString("pname"));
				t.setPprice(rs.getDouble("pprice"));
				t.setPd(rs.getBoolean("pd"));
				
			 
			}
			 return t;
	}
		
		public static ArrayList<PdtPojo> getAll() throws SQLException{
			Connection con = PdtController.getCon();
			PreparedStatement ps =con.prepareStatement("select*from apple.Pdt;");
			 
			ResultSet rs =ps.executeQuery();
			ArrayList<PdtPojo> l =new ArrayList<>();
			 
			while(rs.next()) {
				PdtPojo t = new PdtPojo();
				t.setPid(rs.getInt("pid"));
				t.setPname(rs.getString("pname"));
				t.setPprice(rs.getDouble("pprice"));
				t.setPd(rs.getBoolean("pd"));
				l.add(t);
			 
			}
			 return l;
	}


}
