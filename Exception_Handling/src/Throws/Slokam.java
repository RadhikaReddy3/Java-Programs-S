package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Slokam {

	 public Slokam() {
		 System.out.println("Hi Iam Slokam Default Constructor");
		 
	 }
	 public Slokam(String fpath)throws FileNotFoundException,IOException{
		 
		 
	 }
	 
	 
	 public Slokam(String fpath,int fsize)throws ArithmeticException{
		 
	 }
	 public void m1() {
		 System.out.println("M1 method call");
		  try {
			FileReader fr = new FileReader("E:\\Slokam Files\\empdataone");
			fr.close();
		  }
		 
		catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		}
		  catch(IOException e) {
			  e.printStackTrace();
		  }
			
	  
		 
	 }
	 
	 //public void m2()throws FileNotFoundException,IOException {
		 public void m2()throws IOException
		 {
		 //IO EXCEPTION WILL HANDLES FileNotFoundException ALSO
			 FileReader fr = new FileReader("E:\\Slokam Files\\empdataone");
			 fr.close();
	 }
		  
	 
	 public void m3(){
		 
		 try {
			  System.out.println(10/0);
		 }
		 catch(ArithmeticException e) {
			 e.printStackTrace();
		 }
	 }
		 
		 public void m4(){
			 
			  System.out.println("normal");
		 
		 
	 }
}
