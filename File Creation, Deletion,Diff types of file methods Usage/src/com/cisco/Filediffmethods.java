package com.cisco;

import java.io.File;
public class Filediffmethods {

	public static void main(String[] args) {
		 
		File f =  new File("E:\\Slokam Files\\def.txt") ;
        System.out.println(f.isFile());  
        System.out.println(f.isDirectory());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getParentFile()); 
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath()); 
        System.out.println(f.getPath()); 
        System.out.println(f.getTotalSpace());
        System.out.println(f.getFreeSpace());
        System.out.println(f.getUsableSpace());
        System.out.println(f.length());
        
	}

}
