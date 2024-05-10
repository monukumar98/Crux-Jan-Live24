package Lec40;

public class Cycle_LinkedList {
	class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(int item) {
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
	public void AddLast(int item) {
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

	public void CreateCycle() throws Exception {
		tail.next = getNode(2);
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

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

//O(N^2)
	public void Removal1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

//O(N)
	public void Removal2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// 1. count Cycle ki length
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// 2. fast ko move krna hai m distance
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;

		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	
	public void FloyedCycle() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_LinkedList cl = new Cycle_LinkedList();
		cl.AddLast(10);
		cl.AddLast(20);
		cl.AddLast(30);
		cl.AddLast(40);
		cl.AddLast(50);
		cl.AddLast(60);
		cl.AddLast(70);
		cl.AddLast(80);
		cl.CreateCycle();
		//cl.Removal1();
		cl.FloyedCycle();
		cl.display();

	}

}
