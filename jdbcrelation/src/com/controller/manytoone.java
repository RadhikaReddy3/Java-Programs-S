package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.person;

public class manytoone {

	
public static  List<person> getpersondat(String msim) throws SQLException{
		
		String query = "select p.pid, p.pname, p.page,p.pqual from relate.mobile m inner join relate.person p \r\n"
				+ "on m.msim =? and m.fkpid = p.pid;";
		Connection con =jdbccon.getCon();
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1, msim);
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
		 
		manytoone n = new manytoone();
		 List<person> data1 =n.getpersondat("jio");
		 for(person per:data1) {
			 System.out.println(per);
		 }
		 //System.out.println(data1);

	}

}
