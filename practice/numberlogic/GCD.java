package practice.numberlogic;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1;
		int n2;
		int gcd = 1;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
		int larger = Math.max( n1, n2);
		int smaller = Math.min(n1, n2);
		if(larger % smaller == 0) {
			gcd = smaller;
		} else {
			//break case by starting from highest to lowest common divisor
			for(int i = (smaller/2); i >=1; i--) {
				if((smaller%i == 0) && (larger % i == 0)) {
					gcd = i;
					break;
				}
			}
		}
		System.out.println(gcd);
	}
}
