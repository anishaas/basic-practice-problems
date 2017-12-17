package practice.stack;
import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedStack stack = new LinkedStack();
		int choice;
		int val;
		do {
			System.out.println("Options: 1 = push, 2 = pop, 3 = display, 4 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to add: ");
				val = sc.nextInt();
				stack.push(val);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				System.out.println("The stack: ");
				stack.display();
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
