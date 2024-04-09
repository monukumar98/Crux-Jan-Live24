package Lec30;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(CountPrime(n));

	}

	// index pe 0 hai mtlb index prime number hai
	// index pe 1 hai mtlb index prime number nhi hai
	public static int CountPrime(int n) {

		int[] prime = new int[n + 1];
		prime[0] = 1;// not prime
		prime[1] = 1;// not prime
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == 0) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}
			}

		}

		int ans = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) {
				ans++;
			}
		}
		return ans;
	}

}
