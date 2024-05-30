package Lec47;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			Swap(pi, ci);
			upheapify(pi);
		}

	}

	public int size() {
		return ll.size();
	}

	private void Swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int pi_th = ll.get(pi);
		int ci_th = ll.get(ci);
		ll.set(pi, ci_th);
		ll.set(ci, pi_th);

	}

	public int min() {
		return ll.get(0);
	}

	public void Display() {
		System.out.println(ll);

	}

	public int remove() {
		int v = ll.get(0);
		Swap(0, ll.size() - 1);
		ll.remove(ll.size() - 1);
		downheapify(0);
		return v;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(mini) > ll.get(lci)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(mini) > ll.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(mini, pi);
			downheapify(mini);
		}

	}

}
