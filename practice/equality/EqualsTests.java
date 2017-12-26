package practice.equality;

public class EqualsTests {

	public static void main(String[] args) {
		String a = new String("hello");
		String b = new String("hello");
		
		/*
		 * when ever two objects are equal their hashcode also should be equal.
		 * but when two hashcode are equal their objects neend not be equal.
		 * 
		 */
		
		//we override equals() based on our version of equality
		//and then must also override hashCode to reflect
		//that equality specification (based on our def, same hashcode) 
	
		if(a.equals(b)){
			System.out.println("how are you");
		}
		
		Customer c1 = new Customer(1001,"Anisha",2342);
		Customer c2 = new Customer(1001,"Anisha",2342);
		
		if(c1.equals(c2)){
			System.out.println("Both customers are equal");
		}
		
		System.out.println(c1);
		
		//typically, when creating a custom class
		//overriding equals() etc. is helpful (based on necessity)
	}

}
