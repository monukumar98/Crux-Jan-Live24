package Lec12;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));
	}

	public static long Chewbacca(long n) {
		long sum = 0;
		long mul = 1;
		while (n > 9) {
			long rem = n % 10;
			if (rem >= 5) {
				sum = sum + (9 - rem) * mul;
			} else {
				sum = sum + rem * mul;
			}
			n = n / 10;
			mul = mul * 10;
		}
		if (n == 9 || n < 5) {
			sum = sum + n * mul;
		} else {
			sum = sum + (9 - n) * mul;
		}
		return sum;

	}

}
