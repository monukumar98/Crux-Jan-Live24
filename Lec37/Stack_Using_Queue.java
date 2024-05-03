package Lec37;

import Lec36.DynamicQueuue;

public class Stack_Using_Queue {
	private DynamicQueuue q;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		q = new DynamicQueuue();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

	public int size() {
		return q.size();
	}

	public void push(int item) throws Exception {
		if (isEmpty()) {
			q.Enqueue(item);
		} else {
			DynamicQueuue h = new DynamicQueuue();
			while (!q.isEmpty()) {
				h.Enqueue(q.Dequeue());
			}
			q.Enqueue(item);
			while (!h.isEmpty()) {
				q.Enqueue(h.Dequeue());
			}
		}
	}

	public int pop() throws Exception {
		return q.Dequeue();
	}

	public int peek() throws Exception {
		return q.GetFront();
	}

	public static void main(String[] args) throws Exception {
		Stack_Using_Queue s = new Stack_Using_Queue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.peek());
	}
}
