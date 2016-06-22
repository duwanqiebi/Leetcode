

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
	
	public int minDepth(TreeNode root) {
		int depth = 0;
		if(root == null){
			return depth;
		}
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		TreeNode curNode = null;
		while( !queue.isEmpty()){
			depth ++;
			int size = queue.size();
			for(int i = 0;i < size; i ++){
				curNode = queue.poll();
				if(curNode.left == null && curNode.right == null){
					return depth;
				}
				if(curNode.left != null){
					queue.add(curNode.left);
				}
				if(curNode.right != null){
					queue.add(curNode.right);
				}
			}
		}
		
		return depth;
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
