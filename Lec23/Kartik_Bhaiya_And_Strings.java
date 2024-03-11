package Lec23;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		String s = "abaaaabaaaababaaaabbaaa";
		int flipa = Maxlen(s, k, 'a');
		int flipb = Maxlen(s, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Maxlen(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) == ch) {
				flip++;
			}

			// shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// ans calculate
			ans = Math.max(ans, (ei - si + 1));
			ei++;
		}
		return ans;

	}

}
