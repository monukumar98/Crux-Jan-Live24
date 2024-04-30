package Lec34;

public class Stack {
	protected int[] arr;
	private int idx;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == 0;
	}

	// O(1)
	public boolean isFull() {
		return idx == arr.length;
	}

	// O(1)
	public int size() {
		return idx;
	}

	// O(1)
	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("bklol stack full h");
		}
		this.arr[this.idx] = item;
		this.idx++;// idx++;
	}

	// O(1)
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("bklol stack Empty h");
		}
		int v = arr[idx - 1];
		idx--;
		return v;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("bklol stack Empty h");
		}
		int v = arr[idx - 1];
		return v;
	}

	public void Display() {
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		st.push(10);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		st.push(50);
//		st.Display();
//		System.out.println(st.peek());
//		//st.push(7);
//		
//
//	}
}
