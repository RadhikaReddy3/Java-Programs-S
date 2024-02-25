package Throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class STest {

	public static void main(String[] args) {
	 
	 
			Slokam s=new Slokam( );
		 
		
		try {
			Slokam s1=new Slokam("E:\\Slokam Files\\empdataone");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
		Slokam s2=new Slokam("E:\\Slokam Files\\empdataone",50);//Unchecked
		
		s2.m1();//Handling itself so just call
		
		
		try {
			s2.m2();//Handle by us both are checked
		}  
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s2.m3();//Handling itself so just call
		s2.m4();//unchecked

	}

}
