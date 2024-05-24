package Lec44;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Level_Order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Tree_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	Scanner sc = new Scanner(System.in);

	private void createTree() {
		// TODO Auto-generated method stub
		int v = sc.nextInt();
		Node nn = new Node();
		nn.val = v;
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while (!q.isEmpty()) {
			Node rn = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rn.left = node;
				q.add(node);

			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rn.right = node;
				q.add(node);
			}
		}

	}

}
