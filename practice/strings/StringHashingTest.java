package practice.strings;

import java.util.Scanner;

import practice.sets.HashTable;

public class StringHashingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String val;
		StringHashing table = new StringHashing();
		do {
			System.out.println("Options: 1 = insert, 2 = delete, 3 = search, 4 = display 5 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to insert: ");
				val = sc.next();
				table.insert(val);
				break;
			case 2:
				System.out.println("Enter the value to delete: ");
				val = sc.next();
				table.delete(val);
				break;
			case 3:
				System.out.println("Enter the value to search for: ");
				val = sc.next();
				System.out.println(table.search(val));
				break;
			case 4:
				table.display();
				break;
			case 5:
				exit();
				break;
			}
		} while (choice != 5);
	}
	
	private static void exit() {
		System.out.println("Exiting program");
	}

}
