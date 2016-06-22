
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curNode = root;
		TreeNode preNode = root;
		int stackSum = 0;
		
		while(!stack.isEmpty() || curNode != null){
			if(curNode != null){
				stack.push(curNode);
				stackSum += curNode.val;
				curNode = curNode.left;
			}else{
				curNode = stack.peek();
				if(curNode.right != preNode && curNode.right != null){
					curNode = curNode.right;
				}else{
					if(curNode.left ==null && curNode.right == null && stackSum == sum){
						List<Integer> list = new ArrayList<>();
						for(TreeNode node : stack){
							list.add(node.val);
						}
						result.add(list);
					}
					curNode = stack.pop();
					stackSum -= curNode.val;
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