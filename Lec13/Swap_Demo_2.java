package Lec13;

public class Swap_Demo_2 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 6, 7 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
