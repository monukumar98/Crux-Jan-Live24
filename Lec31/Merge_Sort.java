package Lec31;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 4, 1 };
		int[] a = Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static int[] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] b = new int[1];
			b[0] = arr[si];
			return b;
		}
		int mid = (si + ei) / 2;
		int[] f = Sort(arr, si, mid);
		int[] s = Sort(arr, mid + 1, ei);
		return Merge(f, s);

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
