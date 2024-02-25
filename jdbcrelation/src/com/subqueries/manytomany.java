package com.subqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.controller.jdbccon;
import com.pojo.course;
import com.pojo.mobile;
import com.pojo.person;

public class manytomany {
	
	public static  List<course>getcoudata(String pname) throws SQLException{
		String query = "select*from relate.course c where c.cid in(select pc.fkcid from relate.pccourse pc where fkpid in(select p.pid from relate.person p where p.pname=?));";
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
		String query = "select*from relate.person p where p.pid in(select pc.fkpid from relate.pccourse pc where fkcid in(select c.cid from relate.course c where c.cname=?));";
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





