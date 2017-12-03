package practice.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 3;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 2;
		arr[4] = 14;
		arr[5] = 78;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed: ");
		int[] arr2 = reverseArray(arr);
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
	
	private static int[] reverseArray(int[] arr) {
		int swaps = arr.length/2;
		for(int i = 0; i < swaps; i++) {
			int temp = arr[i];
			int swapIndex = (arr.length - 1) -i;
			arr[i] = arr[swapIndex];
			arr[swapIndex] = temp;
		}
		return arr;
	}

}
