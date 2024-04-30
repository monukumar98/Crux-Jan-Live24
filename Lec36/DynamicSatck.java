package Lec36;

import Lec34.Stack;

public class DynamicSatck extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		DynamicSatck ds = new DynamicSatck();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.Display();
	}
}
