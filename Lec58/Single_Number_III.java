package Lec58;

import java.util.Arrays;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(Single_Number(arr)));
	}

	public static int[] Single_Number(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		int temp = ans;
		int pos = 0;
		while ((temp & 1) == 0) {
			pos++;
			temp >>= 1;
		}
		int mask = (1 << pos);
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((mask & arr[i]) != 0) {
				a = a ^ arr[i];
			}
		}
		int b = ans ^ a;
		// int []ar= {a,b};
		return new int[] { a, b };
	}

}
