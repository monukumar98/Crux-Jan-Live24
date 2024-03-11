package Lec22;

import java.util.*;

public class Arrays_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();// same Concept String wala
		System.out.println(ll);
		// size
		System.out.println(ll.size());

		// Add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, -9);// Index 0 to Size //O(N)
		System.out.println(ll);
//		ArrayList<Long> ll1 = new ArrayList<>();
//		ll1.add(10l);

		// get
		System.out.println(ll.get(2));// Index 0 to Size-1 O(1)
		// index
		System.out.println(ll.indexOf(10));// O(N)

		// remove
//		int ele = ll.remove(2);// Un-Boxing Index 0 to Size-1
		System.out.println(ll.remove(2));// O(N)
		System.out.println(ll);

		// update
		ll.set(1, 140);// O(1)
		System.out.println(ll);
		ll.add(3);
		ll.add(13);
		ll.add(31);
		// Sort
		System.out.println(ll);
		Collections.sort(ll);
		// Collections.reverse(ll);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}

	}

}
