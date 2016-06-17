## [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

>Invert a binary tree.

><pre>     4
   /   \
  2     7
 / \   / \
1   3 6   9</pre>

>to

><pre>     4
   /   \
  7     2
 / \   / \
9   6 3   1</pre>


翻转二叉树

### 方法一 递归

递归翻转每个子树

   
### 方法二 非递归

非递归方法借助了一个队列来模拟递归，按层遍历，交换每个子树


