

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Solution {
	
	public boolean isValidBST(TreeNode root) {
		return true;
		
	}
	/** ·ÇµÝ¹é  ÖÐÐò±éÀú**/
	public boolean isValidBST1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curNode = root;
		List<Integer> list = new ArrayList<>();
		while(!stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				curNode = curNode.left;
			}else{
				curNode = stack.pop();
				list.add(curNode.val);
				curNode = curNode.right;
			}
		}
		
		for(int i = 1 ; i < list.size(); i ++){
			if(list.get(i - 1) >= list.get(i)){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode root1 = new TreeNode(1);
		//TreeNode root2 = new TreeNode(3);
		root.left = root1;
		//root.right = root2;
		System.out.println(new Solution().isValidBST1(root));
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
