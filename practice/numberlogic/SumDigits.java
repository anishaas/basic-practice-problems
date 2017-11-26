package practice.numberlogic;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num;
		int sum = 0;
		num = sc.nextInt();
		sc.close();
		while(num > 0) {
			//keep adding a digit
			sum = sum + num % 10;
			num = num / 10;
		} 
		System.out.println(sum);
	}
}

