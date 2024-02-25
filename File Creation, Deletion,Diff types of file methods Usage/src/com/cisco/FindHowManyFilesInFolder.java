package com.cisco;
import java.io.File;
public class FindHowManyFilesInFolder {

	 

	public static void main(String[] args) {
		 File f =new File("E:\\");
		 System.out.println( f.isHidden());
		 String[]files = f.list();
		 
		 for(int i=0;i<files.length;i++) {
			 
			if(files[i].startsWith("C")&&files[i].length()<50)
			 System.out.println(files[i]+"------"+files[i].length());//it gives round off value
		 }

	}

}
