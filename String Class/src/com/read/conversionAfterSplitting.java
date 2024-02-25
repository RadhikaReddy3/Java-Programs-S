package com.read;

public class conversionAfterSplitting {

	public static void main(String[] args) {
		 
		
		String s="101,siva,21,bsc,65.2";
		String[] b=s.split(",");
		String sid =b[0];
		//int sid =b[0];//Error so convert  string to int
		System.out.println(sid);
		
		
		int sidd = Integer.parseInt(b[0]);
		String sname= b[1];
		int sage = Integer.parseInt(b[2]);
		String squal=b[3];
		double smarks = Double.parseDouble(b[4]);
		
	    System.out.println(sidd);

	}

}
