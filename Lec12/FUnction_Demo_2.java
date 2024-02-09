package Lec12;

public class FUnction_Demo_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coding Blocks");
		int a = 4;
		int b = 11;
		int ans = Add(a, b);
		System.out.println(ans);
//		System.out.println(Add(a, b));
		System.out.println("Bye");
	}
	public static int Add(int a, int b) {
		int c = a + b;
		c = c + Sub(b, c);
		return c;

	}
	public static int Sub(int a, int b) {
		int c = a - b;
		return c;

	}
}
