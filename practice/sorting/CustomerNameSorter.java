package practice.sorting;

import java.util.Comparator;

public class CustomerNameSorter implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1 == null || o2 == null) {
			return 0;
		}
		
		if(o1.getName() == null || o2.getName() == null) {
			return 0;
		}
		
		return o1.getName().compareTo(o2.getName());		
	}

}
