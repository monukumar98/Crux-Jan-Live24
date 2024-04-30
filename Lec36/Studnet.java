package Lec36;

public class Studnet {

	int age = 20;
	String name = "Raj";
	@Override
	public String toString() {
		return this.age+" "+this.name;
	}

	public static void main(String[] args) {
		Studnet s = new Studnet();
		String s1 = "Kaju";
		System.out.println(s);
		System.out.println(s1);

	}

}
