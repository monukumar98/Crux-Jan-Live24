package Lec12;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Boston_Numbers(n));
	}

	public static int Is_Boston_Numbers(int n) {
		int digit = sumofdigit(n);
		int pf = 0;
		int div = 2;
		while (div <= n) {
			int rem = n % div;
			if (rem == 0) {
				pf = pf + sumofdigit(div);
				n = n / div;
			} else {
				div++;
			}

		}
		if (pf == digit) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int sumofdigit(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum += rem;// sum = sum + rem;
			num = num / 10;
		}
		return sum;

	}

}
