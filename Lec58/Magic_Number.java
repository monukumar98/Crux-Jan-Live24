package Lec58;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(MagicNumber(n));
	}

	public static long MagicNumber(int n) {
		long mul = 5;
		long ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			mul *= 5;
			n >>= 1;
		}
		return ans;
	}

}
