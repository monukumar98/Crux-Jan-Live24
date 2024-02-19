package Lec16;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;

	}

	public static int firstBad(int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

//leetcode
	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
