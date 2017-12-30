package practice.sets;

import java.util.HashSet;
import java.util.Set;

public class CustomerJavaSetTest {

	public static void main(String[] args) {
		Set<Customer> myCustomerSet = new HashSet<Customer>();
		
		Customer c1 = new Customer(1001,"Anisha",2343);
		Customer c2 = new Customer(1001,"Anisha",2343);
		
		myCustomerSet.add(c1);
		myCustomerSet.add(c2);
		
		System.out.println(myCustomerSet.size());
		
		for(Customer cust : myCustomerSet){
			System.out.println(cust);
		}

	}

}
