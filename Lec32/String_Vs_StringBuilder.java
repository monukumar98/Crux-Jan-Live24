package Lec32;

public class String_Vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Demo();
		//StringBuilder_Demo();
	}

	public static void String_Demo() {
		String sb = "";
		for (int i = 0; i < 1000000; i++) {
			sb = sb + i;
		}
		System.out.println(sb);
	}

	public static void StringBuilder_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
