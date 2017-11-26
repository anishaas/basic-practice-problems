package practice.numberlogic;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num;
		boolean prime = true;
		num = sc.nextInt();
		sc.close();
		for(int i = 2; i <= (num/2); i++) {
			//check divisible 
			if(num % i == 0) {
				prime = false;
				break;
			} 
		}
		
		if(prime) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime");
		}
	}

}
