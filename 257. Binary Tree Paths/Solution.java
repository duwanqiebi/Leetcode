

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curNode = root;
		TreeNode preNode = root;
		
		while(!stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				curNode = curNode.left;
			}else{
				curNode = stack.peek();
				
				if(curNode.right != preNode && curNode.right != null){
					curNode =curNode.right;
				}else{
					if(curNode.left == null && curNode.right == null){
						String str = "";
						for(TreeNode node : stack){
							str += String.valueOf(node.val);
							str += "->";
						}
						str = str.substring(0, str.length() - 2);
						result.add(str);
					}
					curNode = stack.pop();
					preNode = curNode;
					curNode = null;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);t2.right = t1;
		
		TreeNode t3 = new TreeNode(3);
		TreeNode root = new TreeNode(1);root.left=t2;root.right=t3;
		
		System.out.println(new Solution().binaryTreePaths(root));
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