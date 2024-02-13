package Lec13;

public class Maximum_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8, 6 };
		System.out.println(max(arr));
	}

	public static int max1(int[] arr) {
		// TODO Auto-generated method stub
		int m = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
		}
		return m;
	}

	public static int max(int[] arr) {
		// TODO Auto-generated method stub
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

}
