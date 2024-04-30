package Lec34;


public class Queue {

	protected int[] arr;
	protected int size;
	protected int front;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

//O(1)
	public boolean isEmpty() {
		return size == 0;
	}

	// O(1)
	public boolean isfull() {
		return size == arr.length;
	}

	// O(1)
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Queue full hai ");
		}
		int idx = (size + front) % arr.length;
		arr[idx] = item;
		size++;
	}

	// O(1)
	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hai ");
		}
		int v = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	// O(1)
	public int GetFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue Empty hai ");
		}
		int v = arr[front];
		return v;
	}

	public int size() {
		return size;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(50);
		q.Enqueue(60);
		q.Display();
		
	}

}






