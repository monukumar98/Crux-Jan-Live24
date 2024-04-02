package Lec27;

public class Count_Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + CountPath(n, 0, ""));

	}

	public static int CountPath(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count += CountPath(n, curr + dice, ans + dice);
		}
		return count;
//		PrintPath(n, curr + 1, ans + 1);
//		PrintPath(n, curr + 2, ans + 2);
//		PrintPath(n, curr + 3, ans + 3);

	}

}
