

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		boolean isZig = false; // 是否翻转，true表示翻转
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> currLevel = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode currNode = queue.poll();
				currLevel.add(currNode.val);
				if (currNode.left != null) {
					queue.add(currNode.left);
				}

				if (currNode.right != null) {
					queue.add(currNode.right);
				}

			}
			if(isZig){
				Collections.reverse(currLevel);
			}
			isZig = !isZig;
			result.add(currLevel);
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