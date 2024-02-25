package FileToDatabaseStudent;

import java.util.*;
import java.io.*;

public class DaoFileReader {
	
	public List<Student> datafromfile() throws Exception{
		
		List<Student> data = new ArrayList<>();
		FileReader fr = new FileReader("E:\\Slokam Files\\student.txt");
		BufferedReader br = new BufferedReader(fr);
		
		for(String s =br.readLine();s!=null;s=br.readLine()) {
			Student st = new Student();
			String sd[]=s.split(",");
			st.setSid(Integer.parseInt(sd[0]));
			st.setSname(sd[1]);
			st.setSage(Integer.parseInt(sd[2]));
			st.setSmarks(Double.parseDouble(sd[3]));
			
			data.add(st);
		}
		return data;
	}

}
