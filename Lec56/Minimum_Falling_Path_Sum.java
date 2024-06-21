package Lec56;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -10000000);

		}
		for (int i = 0; i < arr[0].length; i++) {
			ans = Math.min(ans, minFallingPathSum(arr, 0, i,dp));
		}
		System.out.println(ans);
	}

	public static int minFallingPathSum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cc >= arr[0].length || cc < 0) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -10000000) {
			return dp[cr][cc];
		}
		int ld = minFallingPathSum(arr, cr + 1, cc - 1, dp);
		int rd = minFallingPathSum(arr, cr + 1, cc + 1, dp);
		int d = minFallingPathSum(arr, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(rd, Math.min(ld, d)) + arr[cr][cc];

	}
}
