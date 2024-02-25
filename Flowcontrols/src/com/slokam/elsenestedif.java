//Login Page Program
package com.slokam;

public class elsenestedif {

	public static void main(String[] args) {
		 int OTP = 1234;
		 String ffname = "lucky";
		 String sname = "GEMS";
		 String uname = "slokam";
		 String pwd = "s1234";
		 
		 if(uname.equals("slokam")&&pwd.equals("s12345")) {
			 System.out.println("Login success");
		 }
		 else {
			     System.out.println("Incorrect uname and pwd please try with ffname,sname&OTP");
			     System.out.println("Please enter ffname,sname&OTP");
			    if(ffname.equals("lucky")&&sname.equals("GEMSS")) {
			    	System.out.println("uname: "+uname+"\n"+"pwd: "+pwd);
			    }
			    else {
			    	System.out.println("Incorrect ffname,sname"+"\n"+"Try with OTP");
			    }
			    if(OTP == 1234) {
			    	System.out.println("uname: "+uname+"\n"+"pwd: "+pwd);
			    }
			    else {
			    	System.out.println("Invalid OTP"+"\n"+"Your account has been blocked");
			    }
			 
			 
		 }
         System.out.println("Thank you");
	}

}
