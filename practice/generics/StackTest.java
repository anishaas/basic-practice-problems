package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

	public static void main(String args[]) {
		
		LinkedStack<Integer> arr = new LinkedStack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(10);
		//test empty stack
		System.out.println("Should print error message: ");
		if(arr.pop()==null) {
			System.out.println("Avoid null pointer");
		}
		
		arr.push(5);
		arr.push(4);
		arr.push(3);
		arr.push(2);
		arr.push(1);
		arr.display();
		
		arr.pop();
		arr.display();
	}
	
}
