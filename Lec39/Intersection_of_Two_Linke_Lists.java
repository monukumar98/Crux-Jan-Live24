package Lec39;

public class Intersection_of_Two_Linke_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode s = headA;
			ListNode sgf = headB;
			while (s != sgf) {
				if (s == null) {
					s = headB;
				} else {
					s = s.next;
				}
				if (sgf == null) {
					sgf = headA;
				} else {
					sgf = sgf.next;
				}
			}
			return s;

		}
	}

}
