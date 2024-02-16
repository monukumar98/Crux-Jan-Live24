package Lec15;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, -7, 4, -8, 2 };
//		System.out.println(minidx(arr, 1));
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = minidx(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}

	}

	public static int minidx(int[] arr, int index) {
		int idx = index;
		for (int i = index + 1; i < arr.length; i++) {
			if (arr[i] < arr[idx]) {
				idx = i;
			}
		}
		return idx;

	}
}
