package TreeSet;

import java.util.Comparator;

public class BasedonId implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		 
		Integer e1=o1.getEid();
		Integer e2=o2.getEid();
		return e1.compareTo(e2);
	}

}
