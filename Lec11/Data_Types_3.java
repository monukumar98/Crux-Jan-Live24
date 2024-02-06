package Lec11;

import java.util.Scanner;

public class Data_Types_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		int x = (int) (ch);
		System.out.println(x);
		ch++;// ch = (char)(ch + 1)--->b
		ch += 1;// ch = (char)(ch + 1)--->c
		System.out.println(ch);
		ch = (char) (ch + 1);
		System.out.println(ch);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);

	}

}
