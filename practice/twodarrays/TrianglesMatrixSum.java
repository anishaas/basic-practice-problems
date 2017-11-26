package practice.twodarrays;

import java.util.Scanner;

public class TrianglesMatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		populateArray(sc, arr, m, n);
		int lsum = leftTriangle(arr, m, n);
		int rsum = rightTriangle(arr, m, n);
		printTriangles(lsum, rsum);
	}
	
	
	public static void populateArray(Scanner sc, int[][] arr, int rows, int cols) {
		//populate array
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Enter next number: ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static int leftTriangle(int[][]arr, int rows, int cols) {
		int lsum = 0;
		//j values greater than i
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(j > i) {
					lsum = lsum + arr[i][j];
				}
			}
		}
		return lsum;
	}
	
	public static int rightTriangle(int[][]arr, int rows, int cols) {
		int rsum = 0;
		//j values less than i
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(j < i) {
					rsum = rsum + arr[i][j];
				}
			}
		}
		return rsum;
	}
	
	public static int sumTriangles(int[][] arr, int rows, int cols) {
		//add all elements excluding diagonals
		int sum = 0;
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				if(row!=col) {
					sum = sum + arr[row][col];
				}
			}
		}
		return sum;
	}
	
	public static void printTriangles(int lsum, int rsum) {
		System.out.println("Sum of left triangle is: " + lsum);
		System.out.println("Sum of right triangle is: " + rsum);
	}
}


