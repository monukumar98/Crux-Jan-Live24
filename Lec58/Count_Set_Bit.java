package Lec58;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Count_Bit(n));
		System.out.println(FastCount_Bit(n));

	}

	public static int Count_Bit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {// if(n%2!=0)
				c++;
			}
			n >>= 1;// n = n >> 1 // n = n/2;
		}
		return c;
	}

	public static int FastCount_Bit(int n) {
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}

}
