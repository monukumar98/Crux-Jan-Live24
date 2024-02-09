package Lec12;

public class Static_Variable {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coding Blocks");
		System.out.println(val);
		int a = 4;
		int b = 9;
		System.out.println(Add(a, b));
		System.out.println(val);
	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val = 90;
		// val = val - 7;// local me changes
		Static_Variable.val = Static_Variable.val - 7;
		return c;

	}
}
