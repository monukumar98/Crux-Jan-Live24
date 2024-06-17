package Lec54;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 4, 7, 1 };
		System.out.println(Maximum_Ammount(arr, 0));
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		// System.out.println(Maximum_AmmountTD(arr, 0, dp));
		System.out.println(Maximum_AmmountTD1(arr, arr.length - 1, dp));
		System.out.println(Maximum_AmmountBU(arr));
	}

	public static int Maximum_Ammount(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = arr[i] + Maximum_Ammount(arr, i + 2);
		int Dont_rob = Maximum_Ammount(arr, i + 1);
		return Math.max(rob, Dont_rob);

	}

	public static int Maximum_AmmountTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Maximum_AmmountTD(arr, i + 2, dp);
		int Dont_rob = Maximum_AmmountTD(arr, i + 1, dp);
		return dp[i] = Math.max(rob, Dont_rob);

	}

	public static int Maximum_AmmountTD1(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Maximum_AmmountTD1(arr, i - 2, dp);// arr[i] + dp[i-2]
		int Dont_rob = Maximum_AmmountTD1(arr, i - 1, dp);// dp[i-1]
		return dp[i] = Math.max(rob, Dont_rob);// dp[i]=max(rob, dont_rob)

	}

	public static int Maximum_AmmountBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int Dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, Dont_rob);
		}
		return dp[dp.length - 1];
	}

}
