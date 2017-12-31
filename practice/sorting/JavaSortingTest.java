package practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSortingTest {

	public static void main(String[] args) {
		List<Customer> myCustList = new ArrayList<Customer>();
		Customer c1 = new Customer(1001,"Anisha",3232);
		Customer c2 = new Customer(1002,"Ashok",3243);
		Customer c3 = new Customer(1000,"Murali",2343);
		
		myCustList.add(c1);
		myCustList.add(c2);
		myCustList.add(c3);
		
		Collections.sort(myCustList,new CustomerIdSorter());
		for(Customer c : myCustList){
			System.out.println(c);
		}
	}

}
