package Lec20;

public class String_LexcoGraphic_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		String s3 = "tannmay";
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s2.compareTo(s3));
		System.out.println(compareTo(s1, s2));
//  +ve value  s1>s2, -ve value s1<s2, zero s1==s2
	}

	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int l1 = s1.length();
		int l2 = s2.length();
		int n = Math.min(l1, l2);
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);

			}
		}
		return l1 - l2;// +ve value s1>s2, -ve value s1<s2, zero s1==s2
	}

}
