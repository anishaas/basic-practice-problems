package practice.sorting;

import java.util.Comparator;

public class CustomerSalarySorter implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1 == null || o2 == null) {
			return 0;
		}
		
		if(o1.getSalary() > o2.getSalary()) {
			return 1;
		}
		
		if(o1.getSalary() < o2.getSalary()) {
			return -1;
		}
		
		return 0;
		
	}

}
