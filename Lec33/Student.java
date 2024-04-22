package Lec33;

public class Student {
	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SeyHey(String name) {
		MentorName();
		System.out.println(this.name + " Say Hey " + name);
	}

	public static void MentorName() {
		System.out.println("Monu bhaiya");
	}
	static {
	System.out.println("i am in Static block of Studnet class1");	
	}
	static {
		System.out.println("i am in Static block of Studnet class2");	
	}
}
