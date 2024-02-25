package com.cisco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
 
	@Autowired
	 private DataSource dso;
	
	public void save(StudentEntity se) {
		System.out.println("We are in Controller save started");
		System.out.println("Database code starts here");
		System.out.println(dso);
		try {
			Connection con=dso.getConnection();
			System.out.println(con);
			PreparedStatement ps =con.prepareStatement("insert into springjdbc1.stdentity values(?,?,?,?)");
			ps.setInt(1, se.getSid());
			ps.setString(2, se.getSname());
			ps.setDouble(3, se.getSmarks());
			ps.setLong(4, se.getSphone());
			
		int row = ps.executeUpdate();
		System.out.println("Rows Inserted:"+row);
			
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We are in Controller save completed");
	}
	public void update(int sid, long sphone, String sname) {
		System.out.println("We are in Controller save started");
		System.out.println("Database code starts here");
		System.out.println(dso);
		try {
			Connection con=dso.getConnection();
			System.out.println(con);
			PreparedStatement ps =con.prepareStatement(" Update springjdbc1.stdentity set sname =?,sphone =? where sid = ?");
			 
			ps.setString(1,sname);
			ps.setLong(2,sphone);
			ps.setInt(3, sid); 
			
		int row = ps.executeUpdate();
		System.out.println("Rows Updated:"+row);
			
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We are in Controller save completed");
	}

	public void delete(int sid) {
		System.out.println("We are in Controller save started");
		System.out.println("Database code starts here");
		System.out.println(dso);
		try {
			Connection con=dso.getConnection();
			System.out.println(con);
			PreparedStatement ps =con.prepareStatement(" Delete from springjdbc1.stdentity where sid = ?");
			 
			 
			ps.setInt(1, sid); 
			
		int row = ps.executeUpdate();
		System.out.println("Rows deleted:"+row);
			
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We are in Controller save completed");
	}

	public void GetById(int sid) {
		System.out.println("We are in Controller save started");
		System.out.println("Database code starts here");
		System.out.println(dso);
		try {
			Connection con=dso.getConnection();
			System.out.println(con);
			PreparedStatement ps =con.prepareStatement(" Select* from springjdbc1.stdentity where sid = ?");
			 
			 
			ps.setInt(1, sid); 
			
			
		 ResultSet rs =ps.executeQuery();
		 System.out.println("Rows deleted:"+rs);
		 while(rs.next()) {
			 
			
			System.out.println(rs.getInt("sid"));
			System.out.println(rs.getString("sname"));
			System.out.println(rs.getDouble("smarks"));
			System.out.println(rs.getLong("sphone"));
		
		}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}}
		public void  GetAll() {
			System.out.println("We are in Controller save started");
			System.out.println("Database code starts here");
			System.out.println(dso);
			
			 
			try {
				Connection con=dso.getConnection();
				System.out.println(con);
				PreparedStatement ps =con.prepareStatement(" Select* from springjdbc1.stdentity ");
				 	
				
			 ResultSet rs =ps.executeQuery();
			System.out.println("Rows deleted:"+rs);
			while(rs.next()) {
				 
				 
				 System.out.println(rs.getInt("sid"));
				  System.out.println(rs.getString("sname"));
			     System.out.println(rs.getDouble("smarks"));
				 System.out.println(rs.getLong("sphone"));
				 System.out.println("----NEXT STUDENT DETAILS----");
			}
				
		 
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		System.out.println("We are in Controller save completed");
	      
	}

	 
}