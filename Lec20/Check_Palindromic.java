package Lec20;

import java.util.Scanner;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// String s2 = sc.nextLine();
//		// String s=sc.nextLine();
		System.out.println(Palindromic(s));
//		System.out.println(s1);
//		System.out.println(s2);
	}

	public static boolean Palindromic(String s) {

		int i = 0;
		int j = s.length()-1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
