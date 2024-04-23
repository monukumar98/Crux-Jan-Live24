package Lec34;

import java.util.Stack;


public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.capacity());
		for(int v:st) {
			System.out.print(v+" ");
		}
		System.out.println();
		st.push(110);
		st.push(210);
		st.push(310);
		st.push(410);
		st.push(510);
		st.push(-9);
		st.push(11);
		System.out.println(st.size());
		System.out.println(st.capacity());
		Stack<String> st1 = new Stack<>();
		st1.push("RAj");
		st1.add("Ankit");
		System.out.println(st1);
		
	}

}
