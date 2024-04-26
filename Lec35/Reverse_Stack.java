package Lec35;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(1);
		st.push(3);
		st.push(5);
		st.push(7);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);

	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int x =st.pop();
		Reverse(st);
		addlast(st, x);
		
		
	}
	public static void addlast(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		addlast(st, item);
		st.push(x);

	}

}
