package practice.arrays;

import java.util.Scanner;

public class ArrayElementSwapTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100];
		System.out.println("Enter number of numbers you want to use");
		int n = sc.nextInt();
		sc.close();
		//populate array from user inputs
		for(int i = 0; i < n; i++) {
			System.out.println("Enter next number");
			arr[i] = sc.nextInt();
		}
		//beginning to first half
		for(int i = 0; i < n/2; i++) {
			int val = arr[i];
			arr[i] = arr[i+(n/2)];
			arr[i+(n/2)] = val;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
