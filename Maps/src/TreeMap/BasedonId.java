package TreeMap;

import java.util.Comparator;

public class BasedonId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer t = o1.getEid();
		Integer t1 = o2.getEid();
		return t.compareTo(t1);
	}

}
//treeset,tailset, head set