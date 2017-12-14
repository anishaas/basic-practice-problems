package practice.classes;

import java.util.Scanner;

public class EmployeeStackTest {
	
	public static void main(String[] args) {
		
		EmployeeStack empStack = new EmployeeStack();		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Options: 1 = push, 2 = pop, 3 = display, 4 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new employee's id: ");
				int id = sc.nextInt();
				System.out.println("Enter the new employee's name: ");
				String name = sc.next();
				System.out.println("Enter the new employee's salary: ");
				double salary = sc.nextDouble();
				Employee emp = new Employee(id, name, salary);
				empStack.push(emp);
				break;
			case 2:
				Employee popped = empStack.pop();
				if(popped == null) {
					System.out.println("There were no employees to delete.");
				} else {
					System.out.println("This employee was deleted: " + "id: " + popped.getId() + "name: " +
				popped.getName() + "salary: " + popped.getSalary());
				}
				break;
			case 3:
				System.out.println("The stack: ");
				empStack.display();
				break;
			case 4:
				exit();
				break;
			}
		} while (choice != 4);
	}

	private static void exit() {
		System.out.println("Exiting the program.");
	}

}
