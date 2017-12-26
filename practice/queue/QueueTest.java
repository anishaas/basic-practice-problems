package practice.queue;
import java.util.Scanner;

public class QueueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new ArrayQueue();
		int choice;
		int val;
		do {
			System.out.println("Options: 1 = enqueue, 2 = dequeue, 3 = display, 4 = exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to queue: ");
				val = sc.nextInt();
				q.enqueue(val);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				System.out.println("The queue: ");
				q.display();
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
