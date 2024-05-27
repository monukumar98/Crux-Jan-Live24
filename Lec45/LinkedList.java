package Lec45;

public class LinkedList<T> {

	class Node {
		T val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void AddLast(T item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void AddIndex(int k, T item) throws Exception {
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;

		}
	}

	// O(1)
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(N)
	public T getindex(int k) throws Exception {
		return getNode(k).val;
	}

	// O(1)
	public T removefirst() {
		T val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}

		return val;

	}

	// O(N)
	public T removeLast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node nn = getNode(size - 2);
			T val = tail.val;
			tail = nn;
			tail.next = null;
			size--;
			return val;
		}
	}

	// O(N)
	public T removeindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

	public int size() {
		return size;
	}

	private Node getNode(int k) throws Exception {

		if (k < 0 || k >= size) {
			throw new Exception("Bklol k range me to dedo");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;

		}
		System.out.println(".");

	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.AddLast("Raj");
		ll.AddLast("Rajesh");
		ll.AddLast("Kamlesh");
		ll.AddLast("Vimalesh");
		ll.AddLast("Ankit");
		ll.AddLast("Ankita");
		ll.AddLast("Kaju");
		ll.display();
	}

}
