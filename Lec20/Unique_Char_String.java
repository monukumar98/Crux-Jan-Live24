package Lec20;

public class Unique_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		System.out.println(Unique(s));
	}
	public static boolean Unique(String s) {
		int[] frq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			frq[idx]++;// frq[idx]= frq[idx]+1;
		}

		for (int i = 0; i < frq.length; i++) {
			if (frq[i] > 1) {
				return false;
			}
		}
		return true;
	}

}
