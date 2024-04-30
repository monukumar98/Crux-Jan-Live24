package Lec36;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 9));
		int a = 11;
		long b = 13;
		System.out.println(add(b, 11));
		System.out.println(add(a, 2.9));
		System.out.println(add(2, 5, 7));
		System.out.println(add(2, 3.0, 4, 5, 11, 6, 6, 78, 11, 8, 1, 8, 9, 11));

	}

	public static int add(int a, int b) {
		return a + b;

	}

	public static int add(int a, long b) {
		return (int) (a + b);
	}

	public static int add(long a, int b) {
		return (int) (a + b);
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, double b) {
		return (int) (a + b);
	}

	public static int add(int x,double b, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
		}
		return sum;
	}

}
