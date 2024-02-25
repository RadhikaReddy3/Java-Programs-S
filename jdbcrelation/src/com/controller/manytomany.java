package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.course;
import com.pojo.mobile;
import com.pojo.person;

public class manytomany {
	
	public static  List<course>getcoudata(String pname) throws SQLException{
		String query = "select c.cid, c.cname, c.cfee from relate.person p inner join relate.course c inner join relate.pccourse j  \r\n"
				+ "on p.pname =? and p.pid = j.fkpid and j.fkcid=c.cid;";
		Connection con =jdbccon.getCon();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, pname);
		ResultSet rs =ps.executeQuery();
		ArrayList<course> l =new ArrayList<>();
		 
		while(rs.next()) {
			course t = new course();
			t.setCid(rs.getInt("cid"));
			t.setCname(rs.getString("cname"));
			t.setCfee(rs.getDouble("cfee"));
			l.add(t);
		
	}
		return l;
}
	
	public static ArrayList<person>getperdata(String cname) throws SQLException{
		String query = "SELECT pid, pname, page, pqual\r\n"
				+ "FROM relate.person p\r\n"
				+ "INNER JOIN relate.pccourse pc ON p.pid = pc.fkpid\r\n"
				+ "INNER JOIN relate.course c ON pc.fkcid = c.cid\r\n"
				+ "WHERE c.cname =?;\r\n"
				+ "";
		Connection con =jdbccon.getCon();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, cname);
		ResultSet rs =ps.executeQuery();
		ArrayList<person> l =new ArrayList<>();
		 
		while(rs.next()) {
			person t = new person();
			t.setPid(rs.getInt("pid"));
			t.setPname(rs.getString("pname"));
			t.setPage(rs.getInt("page"));
			t.setPqual(rs.getString("pqual"));
			l.add(t);
		 
		}
		 return l;
}
	public static void main(String[] args) throws SQLException {
		 
		manytomany h = new manytomany();
		//ArrayList<course> data=h.getcoudata("siva");
		//System.out.println(data);
		List<course> data1 =h.getcoudata("siva");
		 for(course per:data1) {
			 System.out.println(per);
		 }
		
		/*ArrayList<person> data1=h.getperdata("devops");
		System.out.println(data1);*/

		 List<person> data2 =h.getperdata("cjava");
		 for(person per:data2) {
			 System.out.println(per);
		 }
	}

}


