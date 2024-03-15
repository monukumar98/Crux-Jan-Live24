package Lec25;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Toss(n, "");

	}

	public static void Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		Toss(n - 1, ans + "H");
		Toss(n - 1, ans + "T");

	}

}
