package Lec14;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int k = 3;
		RotateArray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void RotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for (int j = 1; j <= k; j++) {
			int item = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];// 5 index ki value 6 index kr diya
			}
			arr[0] = item;
		}
	}

}
