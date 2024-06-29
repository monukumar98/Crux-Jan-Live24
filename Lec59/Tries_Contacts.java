package Lec59;

import java.util.HashMap;

public class Tries_Contacts {
	class Node {
		Character ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal;// false
		int count = 1;
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.ch = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}

		}
		curr.isterminal = true;

	}

	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}

		}
		return curr.count;
	}
}
