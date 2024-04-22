package Lec33;

public class Person_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Person p = new Person("Ankit", 23);
		System.out.println(p.name);
		System.out.println(p.age);
		Person p1 = new Person("Puneet", 24);
		p1.age = -9;
		System.out.println(p1.name);
		//System.out.println(p1.age);
		System.out.println(p1.age);
	}

}
