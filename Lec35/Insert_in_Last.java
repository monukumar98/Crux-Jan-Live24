package Lec35;

import java.util.Stack;

public class Insert_in_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(1);
		st.push(3);
		st.push(5);
		st.push(7);
		System.out.println(st);
		addlast(st, -11);
		System.out.println(st);

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
