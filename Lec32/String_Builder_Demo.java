package Lec32;

public class String_Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(1);
		sb.append(2);
		sb.append("hello ");
		sb.append(true);
		sb.append("byek");
		System.out.println(sb);
//		sb = sb.reverse();
//		System.out.println(sb);
		System.out.println(sb.substring(1, 4));
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		sb.append("a1");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i) + " ");
		}
		String s = sb.toString();// builder to String
		String s1 = "gyuyi";
		StringBuilder sb1 = new StringBuilder(s1);// string to builder

	}

}
