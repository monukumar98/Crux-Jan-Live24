package Lec19;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		arr[1][2] = -9;
		System.out.println(arr[1][2]);
		// row
		System.out.println(arr.length);
		// col
		System.out.println(arr[0].length);
	}

}
