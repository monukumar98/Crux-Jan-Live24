package Lec27;

public class SubSequnce_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println("\n"+CountSubSeq(str, ""));

	}

	public static int CountSubSeq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");

			return 1;
		}
		char ch = ques.charAt(0);// abcde-->a
		int x = CountSubSeq(ques.substring(1), ans);// bcde,-
		int y = CountSubSeq(ques.substring(1), ans + ch);// bcde,a
		return x + y;

	}

//	static int count = 0;
//
//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			count++;
//			return;
//		}
//		char ch = ques.charAt(0);// abcde-->a
//		Print(ques.substring(1), ans);// bcde,-
//		Print(ques.substring(1), ans + ch);// bcde,a
//
//	}

}
