package Lec34;

public class Student_Client {

	public static void main(String[] args) {// throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student("kaju", 21);
		s.setName("Kamlesh");
		System.out.println(s.getName());
		s.setAge(-9);
		System.out.println("hello");
		System.out.println(s.getAge());
		
//		System.out.println(s.name + " " + s.age);
//		s.name = "Pintu";
//		s.age = -9;
//	
//		System.out.println(s.name + " " + s.age);
	}

}
