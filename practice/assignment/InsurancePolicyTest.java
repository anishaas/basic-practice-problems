package practice.assignment;

import java.util.Scanner;

public class InsurancePolicyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		InsurancePolicyHelper insuranceHelper = new InsurancePolicyHelper();
		do {
			System.out.println("Options: 1 = Create a customer, 2 = Add policy to customer, "
					+ "3 = Display a customer's policies, 4 = Delete a customer"
					+ "5 = Delete a customer's policy 6 = Search for a customer 7 = Search for a policy"
					+ "8 = Sort customers 9 = Sort policies by premium 10 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter customer's id: ");
				Integer id = sc.nextInt();
				System.out.println("Enter customer's name: ");
				String name = sc.next();
				System.out.println("Enter customer's phone: ");
				Integer phone = sc.nextInt();
				System.out.println("Enter customer's address: ");
				String address = sc.next();
				System.out.println("Enter customer's salary: ");
				Double salary = sc.nextDouble();
				System.out.println("Enter customer's policy id: ");
				Integer policyId = sc.nextInt();
				System.out.println("Enter customer's policyName: ");
				String policyName = sc.next();
				System.out.println("Enter customer's policy premium: ");
				Double premium = sc.nextDouble();
				insuranceHelper.createCustomer(id, name, phone, address, salary, policyId, policyName, premium);
				break;
			case 2:
				System.out.println("Enter the customer's id: ");
				int custId = sc.nextInt();
				System.out.println("Enter customer's policy id: ");
				Integer policyId1 = sc.nextInt();
				System.out.println("Enter customer's policyName: ");
				String policyName1 = sc.next();
				System.out.println("Enter customer's policy premium: ");
				Double premium1 = sc.nextDouble();
				insuranceHelper.addPolicyToExistingCustomer(custId, policyId1, policyName1, premium1);
			case 3:
				System.out.println("Enter the customer's id to find his/her policies: ");
				int id2 = sc.nextInt();
				insuranceHelper.getCustomerPolicies(id2);
				break;
			case 4:
				System.out.println("Enter the customer's id to delete: ");
				//automatic boxing and unboxing
				int id1 = sc.nextInt();
				boolean isDeleted = insuranceHelper.deleteCustomer(id1); 
				if(isDeleted) {
					System.out.println("Customer was deleted successfully");
				} else {
					System.out.println("Customer was not found");
				}
				break;
			case 5:
				System.out.println("Enter the customer's id to delete: ");
				int custId2 = sc.nextInt();
				System.out.println("Enter the policy's id to delete: ");
				int policyId2 = sc.nextInt();
				boolean isDeleted1 = insuranceHelper.deletePolicyFromCustomer(custId2, policyId2); 
				if(isDeleted1) {
					System.out.println("Customer was deleted successfully");
				} else {
					System.out.println("Customer was not found");
				}
				break;
			case 6: 
				
			case 8:
				exit();
				break;
			}
		} while (choice != 5);
	}
	
	private static void exit() {
		System.out.println("Exiting program");
	}
}
