

import java.util.Stack;

public class Solution {
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode curNode = root;
		TreeNode preNode = root;
		int stackSum = 0;
		
		while( !stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				stackSum += curNode.val;
				curNode = curNode.left;
			}else{
				curNode = stack.peek();
				if(curNode.right != preNode && curNode.right != null){
					curNode = curNode.right;
				}else{
					curNode = stack.pop();
					preNode = curNode;
					if(curNode.left == null && curNode.right == null && stackSum == sum){
						return true;
					}
					stackSum -= curNode.val;
					curNode = null;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(-2);
		TreeNode t2 = new TreeNode(-3);
		t1.right = t2;
		System.out.println(new Solution().hasPathSum(t1, -3));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}