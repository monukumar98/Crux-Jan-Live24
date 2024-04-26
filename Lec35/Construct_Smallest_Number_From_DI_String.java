package Lec35;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(Construct_Smallest_Number(str));

	}

	public static String Construct_Smallest_Number(String str) {
		int[] ans = new int[str.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c++;
				}

			} else {
				st.push(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]);
		}
		return sb.toString();

	}

}
