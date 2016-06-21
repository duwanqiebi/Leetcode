

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(root == null){
			return result;
		}
		
		Queue<TreeNode> queue = new ArrayDeque<>();
		Queue<TreeNode>	queueBak = new ArrayDeque<>();
		queue.add(root);
		TreeNode curNode = root;
		List<Integer> curLevel = new ArrayList<>();
		while(!queue.isEmpty()){	
			curNode = queue.poll();
			curLevel.add(curNode.val);
			if(curNode.left != null){
				queueBak.add(curNode.left);
			}
			if(curNode.right != null){
				queueBak.add(curNode.right);
			}
			
			if(queue.isEmpty()){
				result.add(curLevel);
				curLevel = new ArrayList<>();
				queue = new ArrayDeque<>(queueBak);
				queueBak.clear();
			}
		}
		return result;
	}
	
	/**一个队列 **/
	public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
        	 return res;
        }
           
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode currNode = q.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
            res.add(currLevel);
        }
        return res;
    }
	
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);;
		System.out.println(new Solution().levelOrder(t1));
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