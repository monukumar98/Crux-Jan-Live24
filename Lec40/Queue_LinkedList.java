package Lec40;

import java.util.*;

public class Queue_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		// LinkedList<Integer> q = new LinkedList<>();
		q.add(10);// add last
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q.remove());// remove first
		System.out.println(q);
		System.out.println(q.poll());// remove first
		System.out.println(q.peek());// view
		System.out.println(q);

	}

}
