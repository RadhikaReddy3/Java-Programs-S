package TreeSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ETest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Press id for EID based data");//o/p:1,2,3
		System.out.println("Press name for ENAME based data");//o/p:3,1,2
		System.out.println("Press sal for ESAL based data");//o/p:2,3,1
		String value = s.next();
		Comparator data = null;
		if(value.equals("id")) {
			data = new BasedonId();
		}
		else if(value.equals("name")) {
			data = new BasedonName();
		}
		else if(value.equals("sal")) {
			data = new BasedonSal();
		}
		
		
		
		TreeSet p = new TreeSet<>(data);
		p.add(new employee(3,"abc",12.3));
		p.add(new employee(1,"def",45.6));
		p.add(new employee(2,"ghi",11.9));
		
		System.out.println("------HeadSet gives less than values than given values-----"+"\n");
		System.out.println(p.headSet(new employee(3,"abc",12.3)));
		System.out.println("\n"+"---TailSet gives greater than values than given values(or equalto)------"+"\n");
		System.out.println(p.tailSet(new employee(3,"abc",12.3)));
		
		
		System.out.println("\n"+"-----Based on given parameter-----"+"\n");
		Iterator<employee> t = p.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
	 
		

	}

}
