package Lec40;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			ListNode start = head;
			while (head != null) {
				st.push(head);
				head = head.next;
				if (st.size() == k) {
					while (!st.isEmpty()) {
						Dummy.next = st.pop();
						Dummy = Dummy.next;

					}
					start = head;
				}
			}
			Dummy.next = null;
			if (st.size() > 0) {
				Dummy.next = start;
			}
			return temp.next;

		}
	}

}
