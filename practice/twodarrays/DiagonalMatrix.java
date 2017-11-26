package practice.twodarrays;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		
		//calculate sum of diagonals
		populateArray(sc, arr, m, n);
		int d1 = leftDiagonal(arr, m);
		int d2 = rightDiagonal(arr, m);
		printDiagonals(d1, d2);
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
		
	public static int leftDiagonal(int[][] arr, int rows) {
		int d1 = 0;
		for(int i = 0; i <= rows; i++) {
			d1 = d1 + arr[i][i];
		}
		return d1;
	}
	
	public static int rightDiagonal(int[][] arr, int rows) {
		int d2 = 0;
		int row = 0;
		for(int i =(rows - 1); i >= 0; i--) {
			d2 = d2 + arr[row][i];
			row++;
		}
		return d2;
	}
	
	public static void printDiagonals(int d1, int d2) {
		System.out.println("The sum of left diagonal is " + d1);
		System.out.println("The sum of right diagonal is " + d2);
	}	
}
