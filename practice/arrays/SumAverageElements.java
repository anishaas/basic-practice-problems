package practice.arrays;

import java.util.Scanner;

public class SumAverageElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100];
		System.out.println("Enter number of numbers you want to use");
		int n;
		n = sc.nextInt();
		sc.close();
		int sum = 0;
		double average = 0;
		for(int i = 0; i < n;i++) {
			System.out.println("Enter next number");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		average = sum/n;
		System.out.println(sum);
		System.out.println(average);
	}

}
