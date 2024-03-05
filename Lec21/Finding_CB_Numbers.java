package Lec21;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int CountCbNumber(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));
				if (isCbnumber(num) == true && isvsisted(visited, i, j - 1) == true) {
					count++;
					for (int si = i; si < j; si++) {
						visited[si] = true;// marked
					}
				}
			}
		}

		return count;
	}

	public static boolean isvsisted(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int si = i; si <= j; si++) {
			if (visited[si] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}
}
