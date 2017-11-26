package practice.loops;

import java.util.Scanner;

public class NumbersTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int lines;
		lines = sc.nextInt();
		sc.close();
		for(int line = 1; line <= lines; line++) {
			int spaces = lines - line;
			for(int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for(int j = line; j > 1; j--) {
				System.out.print(j);
			}
			for(int j = 1; j <= line; j++) {
				System.out.print(j);;
			}
			System.out.println();
		}
	}
}