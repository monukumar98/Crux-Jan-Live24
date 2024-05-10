package Lec40;

import java.util.LinkedList;

public class Stack_Using_LinkedList {

	private LinkedList<Integer> ll;

	public Stack_Using_LinkedList() {
		// TODO Auto-generated constructor stub
		ll = new LinkedList<>();
	}

	public boolean isEmpty() {
		return ll.size() == 0;
	}

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();// remove first
	}

	public int peek() {
		return ll.getFirst();
	}

	private void Display() {
		// TODO Auto-generated method stub
		System.out.println(ll);
	}

	public static void main(String[] args) {
		Stack_Using_LinkedList sl = new Stack_Using_LinkedList();
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(40);
		sl.Display();
		System.out.println(sl.pop());
		sl.Display();

	}
}
