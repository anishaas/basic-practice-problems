package practice.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		
		int[] unsorted = {2, 1, 8, 6, 15, 4};
		insertionSort(unsorted);
		selectionSort(unsorted);
		bubbleSort(unsorted);
	}
	
	private static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int val = arr[i];
			int hole = i;
			//sorting still required
			while(hole > 0 && arr[hole - 1] > val) {
				arr[hole] = arr[hole - 1];
				hole = hole - 1;
			}
			//found correct position for value
			arr[hole] = val;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		//n - 1 because at this point every element 
		//has been checked against last
		for(int i = 0; i < n - 1; i++) {
			//compare to every other unsorted element
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}


}
