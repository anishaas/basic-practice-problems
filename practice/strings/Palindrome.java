package practice.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Enter a string");
		a = sc.next();
		sc.close();
		char[] ch = a.toCharArray();
		int n = a.length();
		int last = n;
		boolean palindrome=true; 
		//check first half of string against second half
		for(int i = 0; i < (n/2); i++) {
			if(ch[i]!=ch[last-1]){
				palindrome = false;
				break;
			}
			last--;
		}
		
		if(palindrome){
			System.out.println("The entered is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
