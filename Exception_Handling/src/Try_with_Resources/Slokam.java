package Try_with_Resources;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class Slokam implements Closeable {

	//public static void main1(String[] args) {
		 
		//FileReader fr = null;
		//BufferedReader br = null;
		
		/*try{
			 fr = new FileReader("E:\\Slokam Files\\slo.txt");
			 br = new BufferedReader(fr);
			 for(String str=br.readLine();str!=null;str=br.readLine()) {
				 System.out.println(str);
			 }
			 System.out.println("Hi");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				 
				e.printStackTrace();
			}*/
			
			public static void main(String[]args) {
				//FileReader fr = null;
				//BufferedReader br = null;
				
				try(FileReader fr = new FileReader("E:\\Slokam Files\\aaa.txt");
						BufferedReader br = new BufferedReader(fr)){
					  
					 for(String str=br.readLine();str!=null;str=br.readLine()) {
						 System.out.println(str);
					 }

					 System.out.println("Hi");
					 System.out.println("Hello");
					 System.out.println(10/5);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				 
			}
			@Override
			public void close() throws IOException {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
				
			}
			 
			 
		

	}


