package Lec36;

public class C extends P {
	int d = 2;
	int d2 = 20;

	@Override
	public void fun() {
		super.fun();//p
		System.out.println("Fun in C");
	}

	public void fun2() {
		System.out.println("Fun2 in C");
	}
}
