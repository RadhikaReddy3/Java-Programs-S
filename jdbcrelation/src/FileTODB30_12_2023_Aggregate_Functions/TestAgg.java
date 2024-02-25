package FileTODB30_12_2023_Aggregate_Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestAgg{

    public static void main(String[] args) {
    	
        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relate", "root", "root");

    
            countRecords(con);
            sumOfSalary(con);
            averageSalary(con);
            minSalary(con);
            maxSalary(con);
            
            con.close();
            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void countRecords(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("select count(*) FROM relate.employee");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) 
        {
        	
            int count = rs.getInt(1);
            System.out.println("Count of records in employee table: " + count);
            
        }
    }

    public static void sumOfSalary(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("select sum(esal) from relate.employee");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            double sum = rs.getDouble(1);
            System.out.println("Sum of salary in employee table: " + sum);
        }
    }

    public static void averageSalary(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("select avg(esal) from relate.employee");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) 
        {
            double avg = rs.getDouble(1);
            System.out.println("Average salary in employee table: " + avg);
        }
    }

    public static void minSalary(Connection con) throws Exception {
        PreparedStatement ps = con.prepareStatement("select min(esal) from relate.employee");
        ResultSet rs = ps.executeQuery();
        
        while (rs.next())
        {
        	
            double min = rs.getDouble(1);
            System.out.println("Minimum salary in employee table: " + min);
            
        }
    }

    public static void maxSalary(Connection con) throws Exception 
    {
        PreparedStatement ps = con.prepareStatement("select max(esal) FROM relate.employee");
        
        ResultSet rs = ps.executeQuery();
        
        
        while (rs.next()) 
        {
        	
            double max = rs.getDouble(1);
            System.out.println("Maximum salary in employee table: " + max);
            
        }
    }
}
