

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	List<Integer> result = new ArrayList<>();
	
	/**递归**/
	public List<Integer> postorderTraversal(TreeNode root) {
		if(root == null){
			return result;
		}
		if(root.left != null){
			postorderTraversal(root.left);
		}
		if(root.right != null){
			postorderTraversal(root.right);
		}
		result.add(root.val);
		
		return result;
    }
	
	/**非递归**/
	public List<Integer> postorderTraversal1(TreeNode root) {
		if(root == null){
			return result;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curNode = root;	//当前节点
		TreeNode preNode = root;	//最近出栈节点
		while(!stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				curNode = curNode.left;
			}else{
				curNode = stack.peek();
				
				if(curNode.right != preNode && curNode.right != null){
					curNode = curNode.right;
				}else{
					curNode = stack.pop();
					result.add(curNode.val);
					preNode = curNode;
					curNode = null;
				}
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