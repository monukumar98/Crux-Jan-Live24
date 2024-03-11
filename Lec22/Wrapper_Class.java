package Lec22;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Integer a1 = 5;
		System.out.println(a);// content
		System.out.println(a1);// address (same Concept String)
		Long l = 67l;
		// Auto-Boxing and UnBoxing
		int x = 9;
		Integer y = 101;
		y = x; // Auto-Boxing
		int p = 91;
		Integer q = 119;
		p = q;// UnBoxing

		Integer b1 = 16;
		Integer b2 = 16;
		Integer b3 = 160;
		Integer b4 = 160;
		System.out.println(b1 == b2);// true
		System.out.println(b3 == b4);// false
	}

}
