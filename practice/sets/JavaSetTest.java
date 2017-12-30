package practice.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetTest {

	public static void main(String[] args) {
		Set<String> mySet = new LinkedHashSet<String>();
		mySet.add("Anisha");
		mySet.add("Ashok");
		mySet.add("Ashok");
		mySet.add("Aakash");
		mySet.add("Bob");
		mySet.add("murali");
		//insertion order maintained and no duplicates
		System.out.println("Printing LinkedHashSet values: ");
		for(String s : mySet) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Printing TreeSet values: ");
		
		Set<String> mySet2 = new TreeSet<String>();
		mySet2.add("Anisha");
		mySet2.add("Ashok");
		mySet2.add("Ashok");
		mySet2.add("Aakash");
		mySet2.add("Bob");
		mySet2.add("murali");
		//insertion order not maintained, sorted order and no duplicates
		for(String s : mySet2) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Printing HashSet values: ");
		
		Set<String> mySet3 = new HashSet<String>();
		mySet3.add("Anisha");
		mySet3.add("Ashok");
		mySet3.add("Ashok");
		mySet3.add("Aakash");
		mySet3.add("Bob");
		mySet3.add("murali");
		//insertion order maintained and no duplicates
		for(String s : mySet3) {
			System.out.println(s);
		}
	}
}
