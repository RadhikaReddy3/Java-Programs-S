package com.subqueries;

import java.sql.Connection;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import com.controller.jdbccon;
import com.pojo.course;
import com.pojo.mobile;
import com.pojo.passport;
import com.pojo.person;

 

  public class onetomany {
	
	public static ArrayList<mobile> getmobdat(String pname) throws SQLException{
		
		String query = "select m.mid ,m.msim, m.mnum from relate.mobile m where fkpid=(select p.pid from relate.person p where p.pname =?);";
		Connection con =jdbccon.getCon();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs =ps.executeQuery();
		ArrayList<mobile> l =new ArrayList<>();
		//List<mobile>l = new ArrayList<>();
		 
		while(rs.next()) {
			mobile t = new mobile();
			t.setMid(rs.getInt("mid"));
			t.setMsim(rs.getString("msim"));
			t.setMnum(rs.getLong("mnum"));
			l.add(t);
		 
		}
		 return l;
		
	}
	
 

	public static void main(String[] args) throws SQLException {
		 onetomany n = new onetomany();
		// ArrayList<mobile> data =n.getmobdat("siva");
		// System.out.println(data);
		  
		 List<mobile> data1 =n.getmobdat("siva");
		 for(mobile per:data1) {
			 System.out.println(per);
		 }

	}

}

/*public class onetomany {
	
	public static HashMap<String,List<mobile>> getmobdat(String pname) throws SQLException{
		
		String query = "select m.mid,m.msim,m.mnum from relate.person p inner join relate.mobile m \r\n"
				+ "on p.pname =? and p.pid = m.fkpid;";
		Connection con =jdbccon.getCon();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs =ps.executeQuery();
		HashMap<String,List<mobile>>  l =new HashMap<>();
		 
		while(rs.next()) {
			mobile t = new mobile();
			t.setMid(rs.getInt("mid"));
			t.setMsim(rs.getString("msim"));
			t.setMnum(rs.getLong("mnum"));
			l.computeIfAbsent(pname, k -> new ArrayList<>()).add(t);
		 
		}
		 return l;
		
	}
	
 

	public static void main(String[] args) throws SQLException {
		 onetomany n = new onetomany();
		 HashMap<String,List<mobile>>  data =n.getmobdat("siva");
		 System.out.println(data);
		 
		  

	}

}*/

 