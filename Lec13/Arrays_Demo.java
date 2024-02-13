package Lec13;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr.length);// array ki size
		// set
		arr[0] = 8;
		arr[1] = 1;
		arr[2] = 9;
		arr[3] = 81;
		arr[4] = -1;
		// arr[-1] = -10;
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] other = arr;
		other[0] = -11;
		System.out.println("************");
		System.out.println(arr[0]);

	}

}
