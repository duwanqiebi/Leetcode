

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	List<Integer> result = new ArrayList<>();
	
	/**µÝ¹é*/
	public List<Integer> inorderTraversal(TreeNode root) {
		if(root == null){
			return result;
		}
		if(root.left != null){
			inorderTraversal(root.left);
		}
		result.add(root.val);
		if(root.right != null){
			inorderTraversal(root.right);
		}
		
		return result;
	}
	
	/**·ÇµÝ¹é*/
	public List<Integer> inorderTraversal1(TreeNode root) {
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curNode = root;
		
		while(!stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				curNode = curNode.left;
			}else{
				curNode = stack.pop();
				result.add(curNode.val);
				curNode = curNode.right;
			}
		}
		
		return result;
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