package Lec48;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(2);
		set.add(12);
		set.add(7);
		set.add(20);
		set.add(90);
		set.add(-11);
		set.add(0);
		set.add(-4);
		System.out.println(set);
//		// get
//		System.out.println(set.contains(6));
//		System.out.println(set.contains(7));
//		// remove
//		System.out.println(set.remove(3));
//		System.out.println(set.remove(7));
//		System.out.println(set);
//		for (int x : set) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(2);
		set1.add(12);
		set1.add(7);
		set1.add(20);
		set1.add(90);
		set1.add(-11);
		set1.add(0);
		set1.add(-4);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(2);
		set2.add(12);
		set2.add(7);
		set2.add(20);
		set2.add(90);
		set2.add(-11);
		set2.add(0);
		set2.add(-4);
		System.out.println(set2);
		System.out.println(set2.remove(2));
		System.out.println(set2);
	}

}
