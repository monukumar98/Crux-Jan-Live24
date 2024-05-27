package Lec45;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		Display(arr,"hey");
		String[] arr1 = { "Ram", "Kaju", "Raju", "Ankit", "Ankita", "Pooja" };
		Display(arr1,9);
	}
	
	public static <T> int  Display1(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return 0;
	}

	public static <T,K>void Display(T[] arr,K x) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(x);
	}

}
