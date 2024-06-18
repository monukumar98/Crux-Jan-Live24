package Lec55;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";// coin;
		String t = "rabbit";// amount
		System.out.println(Count_Subsequences(s, t, 0, 0));

	}

	// i--> s ka track bole to coin
	// j--> t ka track bole to amount
	public static int Count_Subsequences(String s, String t, int i, int j) {
		if (j == t.length()) {// amount end to 1 ways
			return 1;
		}
		if (i == s.length()) {// coin end to 0 ways
			return 0;
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Count_Subsequences(s, t, i + 1, j + 1);
		}
		exc = Count_Subsequences(s, t, i + 1, j);
		return inc + exc;
	}

}
