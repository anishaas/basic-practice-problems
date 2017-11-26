package practice.numberlogic;

import java.util.Scanner;

public class Divisibility {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		sc.close();
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("The number is divisible by 3 and 5");
		} else if(num % 3 == 0) {
			System.out.println("The number is divisible by 3");
		} else if(num % 5 == 0) {
			System.out.println("The number is divisble by 5");
		} else {
			System.out.println("The number is not divisible by either");
		}
	}
	
}
