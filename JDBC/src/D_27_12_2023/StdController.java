package D_27_12_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StdController {
	
	public static Connection getCon() {
		Connection con = null;
		try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","root");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void savedata(StdPojo s) throws SQLException {
		Connection con =StdController.getCon();
		PreparedStatement ps=con.prepareStatement("insert into apple.Std values(?,?,?,?)");
		ps.setInt(1, s.getSid());
		ps.setString(2, s.getSname());
		ps.setDouble(3,s.getSmarks());
		ps.setLong(4, s.getSm());
		int h=ps.executeUpdate();
		System.out.println("No.of rows inserted: "+h);
	}

	public static void UpdateData(int sid, String sname, double smarks) throws SQLException {
		Connection con =StdController.getCon();
		PreparedStatement ps=con.prepareStatement("Update apple.Std set sname =?, smarks=? where sid=? ");
		ps.setString(1, sname);
		ps.setDouble(2, smarks);
		ps.setInt(3, sid);
		int t=ps.executeUpdate();
		System.out.println("No. of rows Updated: "+t);
	}
	public static void DeleteData(int sid) throws SQLException {
		Connection con =StdController.getCon();
		PreparedStatement ps=con.prepareStatement("delete from apple.Std where sid=?");
		ps.setInt(1, sid);
		int t=ps.executeUpdate();
		System.out.println("No. of rows deleted: "+t);
		
	}
	public static void getById(int sid) throws SQLException{
		Connection con =StdController.getCon();
		PreparedStatement ps =con.prepareStatement("select*from apple.Std where sid =?");
		 
		 
		ps.setInt(1,sid);
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			//System.out.println("hi");
			int Stdid = rs.getInt("sid");
			String Stdname = rs.getString("sname");
			double Stdmarks =rs.getDouble("smarks");
			long sphno = rs.getLong("sm");
			
		    System.out.println("Student ID: "+Stdid);
			System.out.println("Student Name: "+Stdname);
			System.out.println("Student Marks: "+Stdmarks);
			System.out.println("Student ContactNo: "+sphno);
			System.out.println("---------Next Student Details-----------");
			}
			
		}
 
		public static StdPojo getbyId(int sid) throws SQLException{
			Connection con = StdController.getCon();
			PreparedStatement ps =con.prepareStatement("select*from apple.Std where sid =?");
			 
			 
			ps.setInt(1,sid);
			ResultSet rs =ps.executeQuery();
			StdPojo t = new StdPojo();
			while(rs.next()) {
				
				t.setSid(rs.getInt("sid"));
				t.setSname(rs.getString("sname"));
				t.setSmarks(rs.getDouble("smarks"));
				t.setSm(rs.getLong("sm"));
				
			 
			}
			 return t;
	}
		
		public static ArrayList<StdPojo> getAll() throws SQLException{
			Connection con = StdController.getCon();
			PreparedStatement ps =con.prepareStatement("select*from apple.Std;");
			 
			ResultSet rs =ps.executeQuery();
			ArrayList<StdPojo> l =new ArrayList<>();
			 
			while(rs.next()) {
				StdPojo t = new StdPojo();
				t.setSid(rs.getInt("sid"));
				t.setSname(rs.getString("sname"));
				t.setSmarks(rs.getDouble("smarks"));
				t.setSm(rs.getLong("sm"));
				l.add(t);
			 
			}
			 return l;
	}


}
