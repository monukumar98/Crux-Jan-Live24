package Lec20;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";// pool
		String s2 = "Bye";// pool
		String s3 = s1 + s2;// Addition of 2 String
		// String s3 = s1.concat(s2);// Addition of 2 String
		System.out.println(s3);
		// s1 = s3;
		s1 = s1 + "bye";
		String s = "raj" + "kumar";// pool
	}

}
