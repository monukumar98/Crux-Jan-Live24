package Lec43;

public class Binary_Tree_Cameras {
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

// -1 need    1--> has Camera
	class Solution {
		public int minCameraCover(TreeNode root) {
			int ans = CountCamera(root);// root ki status
			if (ans == -1) {// camera ki need hai kyu left and right covered isliye
				c++;// camera count for root node
			}
			return c;
		}

		int c = 0;

		public int CountCamera(TreeNode root) {
			if (root == null) {
				return 0;// covered--> null ko always coverd mange beacuse ye node exist nhi krta hai
			}
			// staus ka meaning covered hai bole to 0 reutn krenege
			// staus ka requrment covered hai bole to -1 reutn krenage
			// staus ka meaning has camera hai bole to 1 reutn krenag

			int left = CountCamera(root.left);// left subStree root ka status
			int right = CountCamera(root.right);// rigt subStree root ka status
			if (left == -1 || right == -1) {// left or right me koi ek need hua mei camera fir krunga
				c++;// camera count
				return 1;// has camera
			} else if (left == 1 || right == 1) {// left or right me koi ek hai hua mei as root coverd manunga
				return 0;// covered
			} else {
				return -1;// left and right both coverd itmaens mujhe camera chahiye
			}

		}
	}

}
