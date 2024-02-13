package Lec13;
public class Swap_Demo_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 5, 6, 7, 8, 9 };
//		int[] arr = new int[] { 3, 2, 5, 6, 7, 8, 9 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
