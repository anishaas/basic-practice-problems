package practice.arrays;

import java.util.Arrays;

public class ReferenceSemantics {

	public static void main(String[] args) {
		//passes parameters by value 
		//(so a copy of the value is made and used locally in the method)
		//using a copy of the value of x and you don't change x
		int x = 8; 
		modifyInt(x);
		System.out.println("Expecting no change: ");
		System.out.println(x);
		
		//For an object the value is the reference 
		//so you are passing a reference to the
		//same object and you can change 
		//the object using your copy of the reference.
		int[] xa = new int[5];
		modifyArray(xa);
		System.out.println("Expecting change: ");
		System.out.println(Arrays.toString(xa));
	}

	private static void modifyArray(int[] xa) {
		xa[0] = 1;
	}

	private static void modifyInt(int x) {
		x++;
	}
	
	

}
