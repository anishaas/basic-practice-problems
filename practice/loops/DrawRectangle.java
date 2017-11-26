package practice.loops;

import java.util.Scanner;

public class DrawRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		sc.close();
		int length;
		int lines;
		length = sc.nextInt();
		lines = sc.nextInt();
		for(int i = 1; i <= lines; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
