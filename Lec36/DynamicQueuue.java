package Lec36;

import Lec34.Queue;

public class DynamicQueuue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				newarr[i] = arr[idx];

			}
			front = 0;
			arr = newarr;
		}
		super.Enqueue(item);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueuue dq = new DynamicQueuue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();

	}

}
