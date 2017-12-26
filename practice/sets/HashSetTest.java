package practice.sets;

import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int val;
		HashTable table = new HashTable();
		do {
			System.out.println("Options: 1 = insert, 2 = delete, 3 = search, 4 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to insert: ");
				val = sc.nextInt();
				table.insert(val);
				break;
			case 2:
				System.out.println("Enter the value to delete: ");
				val = sc.nextInt();
				table.delete(val);
				break;
			case 3:
				System.out.println("Enter the value to search for: ");
				val = sc.nextInt();
				System.out.println(table.search(val));
				break;
			case 4:
				exit();
				break;
			}
		} while (choice != 4);
	}
	
	private static void exit() {
		System.out.println("Exiting program");
	}

}
