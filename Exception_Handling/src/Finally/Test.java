package Finally;
import java.io.FileReader;
import java.io.BufferedReader;
 
public class Test {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br = null;
		 
		try {
			 fr=new FileReader("E:\\Slokam Files\\student.txt");
		     br = new BufferedReader(fr);
			
			for(String s=br.readLine();s!=null;s=br.readLine()) {
				System.out.println(s);
			}
			System.out.println(10/0);
			System.out.println("----?????---");
			System.out.println("Connection closed");
		}
		catch(Exception e) {
			System.out.println("Try Block Exception:"+e);
			
		}
		finally {
			System.out.println("Connection closed by finally");
			try {
				br.close();//These can be closed or not risky code right so write in try and catch
				fr.close();
			}
			catch(Exception e2) {
				System.out.println(e2);
			}
			System.out.println("Iam in Finally Block");
		}

	}

}


/*package Finally;
import java.io.FileReader;
import java.io.BufferedReader;
 
public class Test {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br = null;
		 
		try {
			 fr=new FileReader("E:\\Slokam Files\\student.txt");
		     br = new BufferedReader(fr);
			
			for(String s=br.readLine();s!=null;s=br.readLine()) {
				System.out.println(s);
			}
			System.out.println(10/5);//Connections will close
			//System.out.println(10/0);//Connections will not close
			System.out.println("----?????---");
			System.out.println("Connection closed");
		
		
		br.close();
		fr.close();}
		catch(Exception e) {
			System.out.println("Try Block Exception:"+e);
			
		}}}*/
		 


