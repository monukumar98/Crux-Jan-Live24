package Lec20;

public class String_demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s + 10 + 40 + "bye");
		System.out.println(10 + 40 + s + "bye");
		System.out.println(s + (10 + 40) + "bye");
		int[] arr = new int[4];
		System.out.println(arr.length);// variable
		System.out.println(s.length());// method
		System.out.println(s.charAt(2));// 2nd inedx char
		char ch = s.charAt(2);
	}
}
