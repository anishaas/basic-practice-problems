package practice.numberlogic;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int multiplier = 1;
		System.out.println("Enter a number");
		num = sc.nextInt();
		sc.close();
		while(multiplier <= 10) {
			System.out.println(num + "*" + multiplier + "=" + num*multiplier);
			multiplier++;
		}
	}

}
