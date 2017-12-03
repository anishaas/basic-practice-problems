package practice.booleans;

public class LecturePrograms {

	public static void main(String[] args) {
		mystery(0,0);
		mysteryB(false);
	}
	
	public static void mysteryB(boolean b) {
			System.out.print(b + " ");
		b = (b == false);
			System.out.print(b);
	}
	
	public static void mystery(int x, int y) {
	    int z = 0; 
	    System.out.println(x < y);
	    while (x >= y) {
	    	System.out.println(x < y);
	        x = x - y;
	        z++;
	        if (x != y) {
	        	System.out.println(x < y);
	            z = z * 2;
	        }
	        System.out.println(x < y);
	    }
	    System.out.println(x < y);
	    System.out.println(z);
	}


}
