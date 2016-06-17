
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
	
	/**µÝ¹é*/
	public TreeNode invertTree(TreeNode root) {
		if(root == null){
			return null;
		}
		TreeNode result = new TreeNode(root.val);
		if(root.right != null){
			result.left = invertTree(root.right);	
		}
		if(root.left != null){
			result.right = invertTree(root.left);
		}
		return result;
	}
	
	/**·ÇµÝ¹é  °´²ã±éÀú*/
	public TreeNode invertTree1(TreeNode root) {
		if(root == null){
			return null;
		}

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode cur = queue.poll();
			//½»»»cur×óÓÒ×ÓÊ÷
			TreeNode tmp = cur.left;
			cur.left = cur.right;
			cur.right = tmp;
			if(cur.left != null){
				queue.add(cur.left);
			}
			if(cur.right != null){
				queue.add(cur.right);
			}
		}
		
		return root;
	}
	
	public static void main(String[] args){
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		node1.left = node2;
		
		TreeNode result = new Solution().invertTree(node1);
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