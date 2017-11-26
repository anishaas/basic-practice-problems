package practice.twodarrays;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		populateArray(sc, arr, m, n);
	}
	
	public static void populateArray(Scanner sc, int[][] arr, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Enter next number: ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static int findDiagonalSum(int[][] arr, int rows, int cols) {
		int sum = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				//cases 0,0 1,1 etc. and 0,2, 1,1, 2,0 (fixed nums)
				if((i==j) || (i+j)==rows-1) {
					sum = sum + arr[i][j];
				}
			}
		}
		return sum;
	}
}
