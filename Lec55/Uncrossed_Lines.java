package Lec55;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 3, 7, 1, 2, 5 }, nums2 = { 1, 9, 2, 5, 1 };
		System.out.println(lcs(nums1, nums2));
	}

	public static int lcs(int[] s1, int[] s2) {

		int[][] dp = new int[s2.length + 1][s1.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s2[i - 1] == s1[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);
				}
			}

		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
