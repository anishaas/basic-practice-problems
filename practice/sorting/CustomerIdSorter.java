package practice.sorting;

import java.util.Comparator;

public class CustomerIdSorter implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1==null || c2==null){
			return 0;
		}
		if(c1.getId()>c2.getId()){
			return 1;
		}
		if(c1.getId()<c2.getId()){
			return -1;
		}
		return 0;
	}
}
