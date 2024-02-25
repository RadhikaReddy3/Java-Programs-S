package com.addBatch;
import java.util.*;
import java.io.*;

public class DaoFilereader{

	 public List<employee> datafromfile() throws Exception{
		 List<employee> data = new ArrayList<>();
		 
		 FileReader fr = new FileReader("E:\\Slokam Files\\yy.txt");
		 BufferedReader br = new BufferedReader(fr);
		 
		 for(String s =br.readLine();s!=null;s=br.readLine()) {
			 employee e = new employee();
			 String sd[]=s.split(",");
			 e.setEid(Integer.parseInt(sd[0]));
			 e.setEname(sd[1]);
			 e.setEage(Integer.parseInt(sd[2]));
			// e.setEsal(Double.parseDouble(sd[3]));
			 e.setEsal(Double.valueOf(sd[3]));
			 
			 data.add(e);
		 }
		 return data;
		 
		
	 }

}
