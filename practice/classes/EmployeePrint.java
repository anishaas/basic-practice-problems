package practice.classes;

import java.util.Scanner;

public class EmployeePrint {
	
	

	public static void main(String[] args) {
		EmployeeHelper eh = new EmployeeHelper();
		Scanner sc = new Scanner(System.in);
		int choice;
		int val;
		do {
			System.out.println("Options: 1 = add employee, 2 = max salary, 3 = sort and display, 4 = exit");
			choice = sc.nextInt();
			int id;
			String name;
			double salary;
			switch (choice) {
			case 1:
				System.out.println("Enter the employee's id: ");
				id = sc.nextInt();
				System.out.println("Enter the employee's name: ");
				name = sc.next();
				System.out.println("Enter the employee's salary: ");
				salary = sc.nextDouble();
				eh.addEmployee(id, name, salary);
				break;
			case 2:
				Employee maxSalaried = eh.maxSalary();
				System.out.println("Employee " + maxSalaried.getId() + "named " + maxSalaried.getName() +
						"earns the maximum salary of: " + maxSalaried.getSalary());
				break;
			case 3:
				eh.sortByName();
				eh.display();
				break;
			case 4:
				exit();
				break;
			}
		} while (choice != 3);
	}

	
	private static void exit() {
		System.out.println("Exiting this program.");
	}
	
	

}
