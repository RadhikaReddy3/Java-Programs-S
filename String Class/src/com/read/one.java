package com.read;
import java.io.BufferedReader;
import java.io.FileReader;
public class one {

	public static void main(String[] args) {
		try {
		 FileReader fr = new FileReader("E:\\Slokam Files\\student.txt");
			BufferedReader br = new BufferedReader(fr);
			 
			 
			for(String  s= br.readLine() ;s!=null;s=br.readLine()) {
				//System.out.println(s);
				String[] data= s.split(",");
				int sid=Integer.parseInt(data[0]);
				String sname= data[1];
				int sage=Integer.parseInt(data[2]);
				String squal=data[3];
				double smarks =Double.parseDouble(data[4]);
				 
				//if(smarks>=80)
				//if(sid == 101)
				//if(sname.equals("ram"))
				//if(sage == 22)
				//if(squal.equals("btech"))
				if(data[3].equals("btech")){
				System.out.println("sid: "+data[0]);
				System.out.println("sname: "+data[1]);
				System.out.println("sage: "+data[2]);
				System.out.println("squal: "+data[3]);
				System.out.println("smar: "+data[4]);
				
				System.out.println("----next employee details----");
				}
				 
			 
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		 
		 

	}

}
