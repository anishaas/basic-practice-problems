package practice.arrays;

public class SearchRunnningTime {

	public static void main(String[] args) {
		
		int []arr = new int[100000];
		for(int i=0;i<100000;i++){
			arr[i] = 2*i;
		}

		long startTime = System.nanoTime();
		int ele = linearSearch(arr,100000-1,51111);
		long endTime = System.nanoTime();
		long turnAroundTime = (endTime - startTime);
		System.out.println(turnAroundTime);
		
		System.out.println();
		
		long startTimeBinary = System.nanoTime();
		int eleBinary = binarySearch(arr, 100000-1, 511111);
		long endTimeBinary = System.nanoTime();
		long turnAroundTimeBinary = (endTimeBinary - startTimeBinary);
		System.out.println(turnAroundTimeBinary);
	}
	
	private static int binarySearch(int []arr, int count, int val) {
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

	private static int linearSearch(int []arr, int count, int val) {
		for(int i = 0; i <= count; i++) {
			if(arr[i] > val) {
				break;
			}
			if(arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
