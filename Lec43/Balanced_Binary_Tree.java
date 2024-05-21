package Lec43;

public class Balanced_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return Balanced(root).isbal;
		}

		public BalancedPair Balanced(TreeNode root) {
			if (root == null) {
				return new BalancedPair();
			}
			BalancedPair lbp = Balanced(root.left);
			BalancedPair rbp = Balanced(root.right);
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			BalancedPair sbp = new BalancedPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			sbp.isbal = lbp.isbal && rbp.isbal && sb;
			return sbp;

		}

		class BalancedPair {
			boolean isbal = true;;
			int ht = -1;
		}

		public boolean isBalanced2(TreeNode root) {
			if (root == null) {
				return true;
			}
			boolean l = isBalanced2(root.left);
			boolean r = isBalanced2(root.right);
			boolean s = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return l && r && s;
		}

		public int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}

			int lh = ht(root.left);
			int rh = ht(root.right);
			return Math.max(lh, rh) + 1;

		}

	}

}
