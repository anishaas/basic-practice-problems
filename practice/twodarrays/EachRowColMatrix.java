package practice.twodarrays;

import java.util.Scanner;

public class EachRowColMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		int []result = new int[100];
		populateArray(sc, arr, m, n);
		
		result= getRows(arr, m, n);
		System.out.println("Sum of each row");
		print(result,m);
		result=getCols(arr, m, n);
		
		System.out.println("Sum of each column");
		print(result,n);
		result=getCols(arr, m, n);
	}
	
	private static void print(int[] result, int limit) {
		for(int i = 0; i < limit; i++) {
			System.out.println("Sum of " + i + ": " + result[i]);
		}
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
	
	public static int[] getRows(int[][] arr, int rows, int cols) {
		int  [] sumArray = new int[rows];
		for(int row = 0; row < rows; row++) {
			int sum = 0;
			for(int col = 0; col < cols; col++) {
				sum = sum + arr[row][col];
			}
			sumArray[row] = sum;
		}
		return sumArray;
	}
	
	public static int[] getCols(int[][] arr, int rows, int cols) {
		int [] sumArray = new int[cols];
		//outer loop => row changes, col constant
		for(int col = 0; col < cols; col++) {
			int sum = 0;
			for(int row = 0; row < rows; row++) {
				sum = sum + arr[row][col];
			}
			sumArray[col] = sum;
		}
		return sumArray;
	}

}
