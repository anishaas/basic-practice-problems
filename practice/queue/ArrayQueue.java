package practice.queue;

public class ArrayQueue {
	
	private static int[] queue = new int[1000];
	private static int front = -1;
	private static int rear = -1;
	
	public void enqueue(int val) {
		//case full queue 
		if(rear == queue.length - 1) {
			System.out.println("The queue is full");
			return;
		} 
		//case first insert
		if(rear == -1) {
			front++;
		} 
		rear++;
		queue[rear] = val;
	}
	
	public void dequeue() {
		//empty queue
		if(front == -1) {
			System.out.println("The queue is empty");
			return;
		}
		System.out.println(queue[front]);
		//front has reached the last element
		if(front == rear) {
			front = -1;
			rear = -1;
			return;
		} 
 		front++;
	}

	public int display() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");
		}
		return 0;
	}

}
