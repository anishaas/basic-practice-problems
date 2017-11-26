package practice.twodarrays;

import java.util.Scanner;

public class BorderMatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		populateArray(sc, arr, m, n);
		int sum = findBorderSum(arr, m, n);
		printSum(sum);
	}
	
	public static void populateArray(Scanner sc, int[][] arr, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Enter next number: ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static int findBorderSum(int arr[][], int rows, int cols) {
		int sum = 0;
		for(int row = 0; row < rows; row++) {
			//add all of top row and last row
			if(row == 0 || row == (rows - 1)) {
				for(int col = 0; col < cols; col++) {
					sum = sum + arr[row][col];
				}
			} else {
				//middle rows, add col 0 and last col index
				sum = sum + arr[row][0] + arr[row][cols - 1];
			}
		}
		
		return sum;
	}
	
	public static void printSum(int sum) {
		System.out.println(sum);
	}

}
