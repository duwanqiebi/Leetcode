

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
	
	/**�ݹ�*/
	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		int leftDepth = maxDepth(root.left) + 1;
		int rightDepth = maxDepth(root.right) + 1;
		
		return (leftDepth < rightDepth) ? rightDepth : leftDepth;
	}
	
	/**�ǵݹ飬�������**/
	public int maxDepth1(TreeNode root) {
		if(root == null){
			return 0;
		}
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		int depth = 0;
		
		while(! queue.isEmpty()){
			int curSum = queue.size();		//��ǰ����������������
			depth ++;
			for(int i = 0 ; i < curSum; i ++){
				TreeNode tree = queue.poll();
				if(tree.left != null){
					queue.add(tree.left);
				}
				if(tree.right != null){
					queue.add(tree.right);	
				}
				
			}
			
		}
		
		return depth;
	}

	public static void main(String[] args) {
		
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
