package practice.arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		int [] test1 =  {-5, 6, 8, 10};
		System.out.println(insert(test1, 7));
	}
	
	public static int insert(int[] data, int newValue) { int index = data.length - 1;
		int result = data[index];
		data[index] = newValue;
			while(index > 0 && data[index] < data[index - 1]) { int temp = data[index - 1];
			data[index - 1] = data[index];
			data[index] = temp;
			index--; 
		}
		return result; 
	}

}
