package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.*;

public class onetoone {
	 
	
	public passport getdetail1(String pname) throws SQLException {
		
		String query = "select t.ptid, t.ptnum, t.pexpdate from relate.person p inner join relate.passport t "
				+ "on p.pname = ? and p.pid = t.fkpid;";
	Connection con = jdbccon.getCon();
	PreparedStatement ps= con.prepareStatement(query);
	ps.setString(1, pname);
    ResultSet rs=	ps.executeQuery();
	passport t =new passport();
	
	while(rs.next()) {
		
		t.setPtid(rs.getInt("ptid"));
		t.setPtnum(rs.getString("ptnum"));
		t.setPexpdate(rs.getString("pexpdate"));
	}
		return t;
		
	}

	public person getdetail2(String ptnum) throws SQLException {
		
		String query = "select p.pid, p.pname, p.page, p.pqual from relate.person p inner join relate.passport t \r\n"
				+ "on t.ptnum =? and t.fkpid = p.pid;";
	Connection con = jdbccon.getCon();
	PreparedStatement ps= con.prepareStatement(query);
	ps.setString(1,ptnum);
    ResultSet rs=	ps.executeQuery();
	person t =new person();
	
	while(rs.next()) {
		
		t.setPid(rs.getInt("pid"));
		t.setPname(rs.getString("pname"));
		t.setPage(rs.getInt("page"));
		t.setPqual(rs.getString("pqual"));
	}
		return t;
		
	}
	public static void main(String[] args) throws SQLException {
		 onetoone o = new onetoone();
		 passport k=o.getdetail1("siva");
		 System.out.println(k);

		 person j = o.getdetail2("234b");
		 System.out.println(j);
	}

}
