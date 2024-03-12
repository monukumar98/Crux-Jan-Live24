package Lec24;

public class Fast_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 4, 3, 4, 7, 4, 3, 6 };
		int item = 4;
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item, int idx) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == item) {
			return idx;
		}
		return Index(arr, item, idx + 1);

	}

}
