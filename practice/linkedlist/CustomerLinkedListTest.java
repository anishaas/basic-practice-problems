package practice.linkedlist;

import java.util.Scanner;

public class CustomerLinkedListTest {
	
	public static void main(String[] args) {
		
		CustomerLinkedList customers = new CustomerLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Options: 1 = insert at beginning, 2 = insert at position, 3 = insert last, "
					+ "4 = delete at beginning 5 = delete at position 6 = delete at last 7 = display 8 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new customer's id: ");
				int id = sc.nextInt();
				System.out.println("Enter the new customer's name: ");
				String name = sc.next();
				System.out.println("Enter the new customer's phone number: ");
				int phone = sc.nextInt();
				Customer cust = new Customer(id, name, phone);
				customers.insertAtBeginning(cust);;
				break;
			case 2:
				System.out.println("Enter the new customer's id: ");
				int id1 = sc.nextInt();
				System.out.println("Enter the new customer's name: ");
				String name1 = sc.next();
				System.out.println("Enter the new customer's phone number: ");
				int phone1 = sc.nextInt();
				System.out.println("Enter position to insert this customer: ");
				int pos = sc.nextInt();
				Customer cust1 = new Customer(id1, name1, phone1);
				customers.insertAtPos(cust1, pos);
				break;
			case 3:
				System.out.println("Enter the new customer's id: ");
				int id2 = sc.nextInt();
				System.out.println("Enter the new customer's name: ");
				String name2 = sc.next();
				System.out.println("Enter the new customer's phone number: ");
				int phone2 = sc.nextInt();
				Customer cust2 = new Customer(id2, name2, phone2);
				customers.insertAtLast(cust2);
				break;
			case 4:
				customers.deleteAtBeginning();
				break;
			case 5:
				System.out.println("Enter position of customer to delete: ");
				int pos2 = sc.nextInt();
				customers.deleteAtPos(pos2);
				break;
			case 6:
				customers.deleteAtLast();
				break;
			case 7:
				System.out.println("The list of employees: ");
				customers.display();
				break;
			case 8:
				exit();
				break;
			}
		} while (choice != 8);
	}

	private static void exit() {
		System.out.println("Exiting the program.");
	}
	
	

}
