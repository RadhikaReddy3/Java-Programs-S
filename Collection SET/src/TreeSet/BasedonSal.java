package TreeSet;

import java.util.Comparator;

public class BasedonSal implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		Double e1=o1.getEsal();
		Double e2=o2.getEsal();
		return e1.compareTo(e2);
	}

	 

}
