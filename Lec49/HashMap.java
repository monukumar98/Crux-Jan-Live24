package Lec49;

import java.util.ArrayList;

public class HashMap<K, V> {
	private class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> buckt;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		buckt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			buckt.add(null);
		}

	}

	public void put(K key, V value) {
		int idx = HashFun(key);
		Node temp = buckt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = buckt.get(idx);
		node.next = temp;
		buckt.set(idx, node);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / buckt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_buckt = new ArrayList<>();
		for (int i = 0; i < 2 * buckt.size(); i++) {
			new_buckt.add(null);
		}
		ArrayList<Node> ll = buckt;
		buckt = new_buckt;
		for (Node nn : ll) {// old date ke list pe loop lagye ho
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : buckt) {// old date ke list pe loop lagye ho
			while (nn != null) {
				s = s + nn.key + "=" + nn.value + ",";
				nn = nn.next;
			}
		}
		s= s.substring(0, s.length()-1);
		return s + "}";
	}

	public boolean containsKey(K key) {
		int idx = HashFun(key);
		Node temp = buckt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = HashFun(key);
		Node temp = buckt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = HashFun(key);
		Node curr = buckt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			buckt.set(idx, curr.next);
			curr.next = null;
		} else {
			prev.next = curr.next;
		}
		size--;
		return curr.value;
	}

	public int HashFun(K key) {
		int idx = key.hashCode() % buckt.size();
		if (idx < 0) {
			idx += buckt.size();
		}
		return idx;
	}

}
