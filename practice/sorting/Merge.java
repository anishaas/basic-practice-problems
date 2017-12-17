package practice.sorting;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int[] a1 = {3, 4, 7, 9, 11};
		int[] a2 = {5, 6, 7, 12};
		merge(a1, a2, 5, 4);
	}
	
	public static void merge(int [] a1, int [] a2, int n, int m) {
		int[] a3 = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < n && j < m) {
			int val;
			if(a1[i] < a2[j]) {
				val = a1[i];
				i++;
			} else {
				val = a2[j];
				j++;
			}
			a3[k] = val;
			k++;
		}
		
		//copy remaining elements of larger array
		if(i != n) {
			for(int temp = i; temp < n; temp++) {
				a3[k] = a1[temp];
				k++;
			}
		} 
		if(j != m) {
			for(int temp = j; temp < m; temp++) {
				a3[k] = a2[temp];
				k++;
			}
		}
		System.out.println(Arrays.toString(a3));
	}

}
