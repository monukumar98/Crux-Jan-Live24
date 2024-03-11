package Lec23;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(ProductLessThanK(arr, k));

	}

	public static int ProductLessThanK(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int count = 0;
		int p = 1;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];
			// Shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}

			// ans Calculate
			count = count + (ei - si + 1);

			ei++;

		}
		return count;

	}

}
