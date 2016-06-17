

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	List<Integer> result = new ArrayList<>();
	
	
	/**µÝ¹é*/
	public List<Integer> preorderTraversal(TreeNode root) {
		
		if(root == null){
			return result;
		}
		result.add(root.val);
		if(root.left != null){
			preorderTraversal(root.left);	
		}
		if(root.right != null){
			preorderTraversal(root.right);	
		}
		
		return result;
		
	}
	
	/**·ÇµÝ¹é**/
	public List<Integer> preorderTraversal1(TreeNode root) {
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode curTree = stack.pop();
			result.add(curTree.val);
			if(curTree.right != null){
				stack.push(curTree.right);
			}
			if(curTree.left != null){
				stack.push(curTree.left);
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
