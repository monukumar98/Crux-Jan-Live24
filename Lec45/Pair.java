package Lec45;

public class Pair<T, V> {

	T x;
	V y;

	public Pair() {

	}

	public Pair(T x, V y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

	public static void main(String[] args) {
		Pair<Integer, Integer> p = new Pair<>(4, 9);
		Pair<String, Boolean> p1 = new Pair<>();

		Pair[] arr = new Pair[5];
		arr[0] = new Pair<>(4, 7);
		System.out.println(arr[0]);
	}
}
