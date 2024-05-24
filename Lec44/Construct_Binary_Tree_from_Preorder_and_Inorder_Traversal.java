package Lec44;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

		}

		public TreeNode CreateTree(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = Serach(in, ilo, ihi, pre[plo]);
			int count = idx - ilo;
			node.left = CreateTree(pre, in, plo + 1, plo + count, ilo, idx-1);
			node.right = CreateTree(pre, in, plo + count + 1, phi, idx + 1, ihi);
			return node;
		}

		public int Serach(int[] in, int si, int ei, int item) {

			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}

}
