package Lec22;

import java.util.ArrayList;

public class For_Each_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(3);
		ll.add(13);
		ll.add(31);

		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}

	}

}
