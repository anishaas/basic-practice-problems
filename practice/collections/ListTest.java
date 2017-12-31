package practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<Customer>(100);
		Customer c1 = new Customer(1, "Ashok", 123);
		Customer c2 = new Customer(2, "Anisha", 345);
		Customer c3 = new Customer(3, "Anu", 576);
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		
		for(Customer c : custList){
			System.out.println(c);
		}
		
		
	
		List<String>  stringList = new ArrayList<String>();
		stringList.add("hello");
		stringList.add("namaste");
		stringList.add("hi");
		stringList.add("bonjour");
		System.out.println(stringList.contains("namaste"));
		System.out.println(stringList.contains("Hello"));	
		stringList.remove(0);
		for(String s : stringList) {
			System.out.println(s);
		}
		
		
		System.out.println("Should be 0: " + stringList.indexOf("namaste"));
	}

}
