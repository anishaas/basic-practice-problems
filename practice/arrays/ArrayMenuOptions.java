package practice.arrays;

import java.util.Scanner;

public class ArrayMenuOptions {

	private static int[] arr = new int[1000];
	private static int count = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int val;
		do {
			System.out.println("Options: 1 = add, 2 = delete, 3 = search, 4 = display 5 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to add: ");
				val = sc.nextInt();
				add(val);
				break;
			case 2:
				System.out.println("Enter the value to delete: ");
				val = sc.nextInt();
				delete(val);
				break;
			case 3:
				System.out.println("Enter the value to search for: ");
				val = sc.nextInt();
				int index = binarySearch(val);
				if(index == -1) {
					System.out.println("Your element was not found");
				} else {
					System.out.println("Your value was found at index " + index);
				}
				break;
			case 4:
				display();
				break;
			}
		} while (choice != 5);
	}

	private static void display() {
		for(int i = 0; i <= count; i++) {
			System.out.print(arr[i] + " ");
		}	
		System.out.println();
	}
	
	private static int binarySearch(int val) {
		//compare val to mid-point of array
		int low = 0;
		int high = count;
		int middle;
		//Check for equal, else keep reducing range
		while(low<high) {
			middle = (low+high)/2;
			if(val == arr[middle]) {
				return middle;
			} else if(arr[middle] > val) {
				//move high down to middle
				high = middle-1;				
			} else if(arr[middle] < val) {
				//move low up to middle
				low = middle+1;
			}
		}
		return -1;
	}

	private static int search(int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return i;
			}
		}
		return -1;
	}
       
	private static void delete(int val) {	
		int deleteIndex = search(val);
		//alternative for if/else
		if(deleteIndex == -1) {
			System.out.println("The element to be deleted is not found");
			return;
		}
		//shift all elements from delete index on to the left
		//use count vs. length 
		for(int i = deleteIndex; i < count; i++) {
			//shift values
			arr[i] = arr[i + 1];
		}
		//reflect deleted element
		count--;
		System.out.println("The element was deleted successfully");
	}

	private static void add(int val) {
		//empty array case
		if(count == -1) {
			arr[0] = val;
			count = 0;
			return;
		}
		//case val < arr[0]
		//shift values, val = arr[0]
		if(val < arr[0]) {
			//shift values
			for(int i = count; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			//insert at beginning
			arr[0] = val;
			count++;
		} else {
			int position = -1;
			//move through array and insert at middle
			for(int i = 0; i <= count; i++) {
				//identify position
				if(val <= arr[i]) {
					position = i;
					break;
				}
			}
			//use the position to shift elements or insert the last element
			if(position == -1) {
				count++;
				arr[count] = val;
				return;
			}
			for(int i = count; i >= position; i--) {
				arr[i+1] = arr[i];
			}
			arr[position] = val;
			count++;
		}
	}

}
