package practice.loops;

import java.util.Scanner;

public class DrawTriangles {
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
			int stars = (2 * line) - 1;
			for(int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
