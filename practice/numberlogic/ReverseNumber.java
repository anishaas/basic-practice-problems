package practice.numberlogic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		sc.close();
		int num;
		int rev;
		int rnum = 0;
		num = sc.nextInt();
		while (num > 0) {
			rev = num%10;
			rnum = rnum * 10 + rev;
			num = num/10;
		}
		System.out.println(rnum);
	}

}

