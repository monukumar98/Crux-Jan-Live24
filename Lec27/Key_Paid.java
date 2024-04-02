package Lec27;

import java.util.*;

public class Key_Paid {

	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		String ques = "23";
		Print(ques, "", ll);
		System.out.println(ll);

	}

	public static void Print(String ques, String ans, List<String> ll) {// 237
		if (ques.length() == 0) {
			// System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			Print(ques.substring(1), ans + press.charAt(i), ll);
		}
	}

}
