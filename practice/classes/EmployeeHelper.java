package practice.classes;

public class EmployeeHelper {
	
	private Employee[] employees = new Employee[1000];
	private static int count = -1;
	
	
	public  void addEmployee(int id, String name, double salary) {
		count = count+1;
		Employee emp = new Employee(id, name, salary);
		employees[count] = emp;
	}

	public  Employee maxSalary() {
		Employee maxEarner = employees[0];
		double maxSal = employees[0].getSalary();
		for(int i = 1; i <= count; i++) {
			if(employees[i].getSalary() > maxSal) {
				maxSal = employees[i].getSalary();
				maxEarner = employees[i];
			}
		}
		return maxEarner;
		
	}

	public void sortByName() {
		Employee temp;
		for(int i = 0; i < count; i++) {
			//every element must be compared to every element in the list
			for(int j =0; j < count-i; j++) {
				//if employees[i] > employees[i + 1], swap them
				if(employees[j].getName().compareTo(employees[j + 1].getName()) > 0) {
					temp = employees[j + 1];
					employees[j + 1] = employees[j];
					employees[j] = temp;
				}
			}
		}
	}
	
	public void display() {
		for(int i = 0; i <= count; i++) {
			System.out.println("Employee id: " + employees[i].getId());
			System.out.println("Employee name: " + employees[i].getName());
			System.out.println("Employee salary: " + employees[i].getSalary());
		}
	}
}
