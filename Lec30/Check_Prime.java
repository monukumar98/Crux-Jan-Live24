package Lec30;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Isprime(57));

	}

	public static boolean Isprime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
