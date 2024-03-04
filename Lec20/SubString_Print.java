package Lec20;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

}
