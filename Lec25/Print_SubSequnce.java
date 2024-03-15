package Lec25;

public class Print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Print(str, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);// abcde-->a
		Print(ques.substring(1), ans);// bcde,-
		Print(ques.substring(1), ans + ch);// bcde,a

	}

}
