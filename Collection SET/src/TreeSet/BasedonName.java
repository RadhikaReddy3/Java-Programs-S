package TreeSet;

import java.util.Comparator;

public class BasedonName implements Comparator<employee> {

	@Override
	public  int compare(employee o1, employee o2) {
		 
		/*String s = o1.getEname();
		String s1 = o2.getEname();
		return s.compareTo(s1);*/
		return o1.getEname().compareTo(o2.getEname());
	}

}
