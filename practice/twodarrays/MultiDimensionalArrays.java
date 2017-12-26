package practice.twodarrays;

import java.util.Random;
import java.util.Scanner;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		Random rand = new Random();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = rand.nextInt(100) + 1;
			}
		}
		
		printArray(arr, 4, 4);
		System.out.println();
		System.out.println("The array's maximum value is: " + maxValue(arr, 4, 4));
		System.out.println();
		System.out.println("Sum of array values is: " + sumValues(arr, 4, 4));
		System.out.println();
		printColOrder(arr, 4, 4);
	}

	public int[][] matrixAdd(int[][] a, int[][] b) {
	    for(int i = 0; i < a.length; i++) {
	        for(int j = 0; j < a[0].length; j++) {
	            a[i][j] += b[i][j];
	        }
	    }
	    return a;
	}
	
	private static void printArray(int[][] arr, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int maxValue(int[][] arr, int rows, int cols) {
		int max = arr[0][0];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	public static int sumValues(int[][] arr, int rows, int cols) {
		int sum = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	private static void printColOrder(int[][] arr, int rows, int cols) {
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
