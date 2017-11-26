package practice.numberlogic;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1;
		int n2;
		int lcm = 1;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
		int larger = Math.max(n1, n2);
		int smaller = Math.min(n1, n2);
		for(int i = 1; i <= larger; i++) {
			if((smaller * i) % larger == 0) {
				lcm = smaller * i;
				break;
			}
		}
		System.out.println(lcm);
	}

}
