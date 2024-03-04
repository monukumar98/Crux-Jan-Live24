package Lec20;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "      hello   world    bye   india    cows  ";
		s = s.trim();
		String[] arr = s.split(" +");// "\s+"

		// System.out.println(Arrays.toString(arr));
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans += arr[i] + " ";
		}

		System.out.println(ans.trim());
	}

}
